package com.example.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.File;

@Controller
@ResponseBody
@RequestMapping("/sdk")
public class TriColorSDKController {

    @RequestMapping("/getVersion")
    public Object indexPage() {
        return TriColorSdkDLL.INSTANCE.GetVersion();
    }
}
