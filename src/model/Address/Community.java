/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Address;

/**
 *
 * @author Dell
 */
public class Community {
    
    private String community;

    public Community(String communityName){
        this.community = communityName;
    }
    
    public String getCommunityName() {
        return community;
    }

    public void setCommunityName(String communityName) {
        this.community = communityName;
    }
     
}
