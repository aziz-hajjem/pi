/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pi;

import Model.BonPlan;
import Model.Feedback;
import Service.BonPlanService;
import Service.FeedbackService;

/**
 *
 * @author azizh
 */
public class Pi {

    public static void main(String[] args) {
        BonPlanService bonPlanService=new BonPlanService();
        FeedbackService feedbackService= new FeedbackService();
        
        // créer Bon Plan 
        BonPlan b1= new BonPlan("Chez lasaad", "Mnihla", "Garage", 12);
        BonPlan b2= new BonPlan("Chez Azouz", "Ariana", "Circuit", 15);
        BonPlan b3= new BonPlan("Amigo", "Borj louzir", "Garage", 6);
        
        // Ajouter un bonPlan
        //b2.setEtat("accepté");
        //bonPlanService.insert(b2);
        
        // afficher tous les bonplans
        
        //System.out.println(bonPlanService.readAll());
        
        // afficher bonplan by id
        
        //System.out.println(bonPlanService.readById(2));
        
        // Update bonPlan
        //b2.setId_bonplan(2);
        //b2.setNom_bonplan("Aouina");
        //bonPlanService.update(b2);
        
        // trier bonPlan
        //System.out.println(bonPlanService.sortBy("id_user", "desc"));
        
        // delete bonPlan
        //bonPlanService.delete(6);
        
        
        // Créer un feedback 
        Feedback f1= new Feedback(3, "mal endroit", 12, bonPlanService.readAll().get(0));
        Feedback f3= new Feedback(10, "Trés bon  endroit", 12, bonPlanService.readAll().get(2));
        
        // Ajouter un feedback
        //feedbackService.insert(f1);
        //feedbackService.insert(f2);
        //feedbackService.insert(f3);
        
        // update feedback 
        
        //f1.setId_feedback(1);
        //f1.setBonPlan(bonPlanService.readAll().get(2));
        //feedbackService.update(f1);
        
        //Afficher tous les feedbacks
        
        //System.out.println(feedbackService.readAll());
        
        // Afficher feedback by id 
        
        //System.out.println(feedbackService.readById(1));
        
        // Sort feedback by rate
        
        //System.out.println(feedbackService.sortBy("rate", "desc"));
        
        // Delete Feedback 
        //feedbackService.delete(1);
        
        
        
        
        

           
           
    }
}
