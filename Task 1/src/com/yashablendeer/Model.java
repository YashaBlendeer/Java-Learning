package com.yashablendeer;

/**
 * Created by YashaBlendeer on 25.06.2021.
 */

public class Model {
    // The Constants

    private String helloValue;
    private String worldValue;

    // The Program logic

    /**
     * in this method add valueString with this.value
     * @return sentence
     */

    public String addStringOurValue(){
        return helloValue + " " + worldValue;
    }

    public String getHelloValue() {
        return helloValue;
    }

    public void setHelloValue(String helloValue) {
        this.helloValue = helloValue;
    }

    public String getWorldValue() {
        return worldValue;
    }

    public void setWorldValue(String worldValue) {
        this.worldValue = worldValue;
    }

}
