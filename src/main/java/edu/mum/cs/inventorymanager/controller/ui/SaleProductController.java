package edu.mum.cs.inventorymanager.controller.ui;

import edu.mum.cs.inventorymanager.model.entity.Item;
import edu.mum.cs.inventorymanager.model.entity.Merchant;
import edu.mum.cs.inventorymanager.model.entity.Product;
import edu.mum.cs.inventorymanager.service.contract.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/sale")
public class SaleProductController {

    @Autowired
    private ProductService productService;



    @GetMapping(value = {"", "/", "/index"})
    public ModelAndView products(Principal principal, HttpSession session) {
        ModelAndView mav = new ModelAndView();
        if(principal==null){
            mav.setViewName("common/login");
            return mav;
        }
        Merchant merchant = (Merchant) session.getAttribute("merchantInfo");
        List<Product> products = productService.findAllMerchantProducts(merchant);
        mav.addObject("products", products);
        mav.setViewName("users/merchant/sale");
        return mav;
    }


    @GetMapping(value = {"/add/{id}"})
    public String addProduct(@PathVariable Long id, Model model,HttpSession session) {
        Product product = productService.findById(id);
        Merchant merchant = (Merchant) session.getAttribute("merchantInfo");
        List<Product> products = productService.findAllMerchantProducts(merchant);
        if (session.getAttribute("cart")==null) {
            List<Item> cart = new ArrayList<>();
            cart.add(new Item(product,1));
            model.addAttribute("products",products);
           // model.addAttribute("cart", cart);
            session.setAttribute("cart", cart);
//            return "users/merchant/sale";
        }else{
            model.addAttribute("products",products);
            List<Item> cart = (List<Item>) session.getAttribute("cart");
            int index = isExists(id,cart);
            if(index == -1){
                cart.add(new Item(product,1));
            }else{
               int quantity = cart.get(index).getQuantity()+1;
               cart.get(index).setQuantity(quantity);
            }
            session.setAttribute("cart", cart);
        }
        return "users/merchant/sale";
    }


    private int isExists(Long id , List<Item> cart){
        for (int i = 0;i<cart.size();i++){
            if(cart.get(i).getProduct().getId()==id){
                   return i;
            }
        }
        return -1;
    }

    @GetMapping(value = {"/buy"})
    public String buyProduct(HttpSession session) {
        List<Item> cart = (List<Item>) session.getAttribute("cart");
        System.out.println("HI YAHIA THIS IS CHART");
        System.out.println(cart);
       // cart.remove(id);
        return "users/merchant/sale";
    }
//    @PathVariable Long id, Model model,
//    public String add(
//            @PathVariable Long id,
//            Principal principal,
//            HttpSession session) {
//
//        if(session.getAttribute("cart")==null){
//            List<Item> cart = new ArrayList<>();
//            cart.add(new Item(productService.findById(id),1));
//            session.setAttribute("cart", cart);
//        }else{
//
//        }

















//
//        @GetMapping(value = {"/add/{id}"})
//        public String addProduct(@PathVariable Long id, Model model,HttpSession session) {
//            Product product = productService.findById(id);
//            Merchant merchant = (Merchant) session.getAttribute("merchantInfo");
//            List<Product> products = productService.findAllMerchantProducts(merchant);
//            if (product != null && session.getAttribute("cart")==null) {
//                List<Item> cart = new ArrayList<>();
//                cart.add(new Item(product,1));
//                model.addAttribute("products",products);
//                model.addAttribute("cart", cart);
//                session.setAttribute("cart", cart);
//                return "users/merchant/sale";
//        }else{
//            List<Item> cart = (List<Item>) session.getAttribute("cart");
//            int index = isExists(id,cart);
//            if(index == -1){
//                cart.add(new Item(product,1));
//            }else{
//               int quantity = cart.get(index).getQuantity()+1;
//               cart.get(index).setQuantity(quantity);
//            }
//            session.setAttribute("cart", cart);
//        }
//                return "users/merchant/sale";
//            }








}
