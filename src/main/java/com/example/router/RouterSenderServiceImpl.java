package com.example.router;



import com.example.router.model.Report;

import javax.jws.WebService;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebService(endpointInterface = "com.example.router.RouterSenderService")
public class RouterSenderServiceImpl implements RouterSenderService {
    public void notifyUser(String user, String message) {

    }

    public List<String> getAdmins() {
        List<String> ans=new ArrayList<>();
        return ans;
    }

    public List<String> getLecturers() {
        List<String> ans=new ArrayList<>();
        return ans;
    }

    public List<String> getThreeDaysNotTrackingUsers() {
        List<String> ans=new ArrayList<>();
        return ans;
    }

    public List<String> getOneDaysNotTrackingUsers() {
        List<String> ans=new ArrayList<>();
        return ans;
    }

    public List<Report> getReportsToday() {
        List<Report> ans=new ArrayList<>();
        return ans;
    }

    public List<String> getUserNamesByRole(String roleName) {
        List<String> ans=new ArrayList<>();
        return ans;
    }

    public void pdf(byte[] pdfBytes, List<String> lectorNickName) throws IOException {

    }

}
