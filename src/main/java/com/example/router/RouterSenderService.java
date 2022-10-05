package com.example.router;

import com.example.router.model.Report;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.io.IOException;
import java.util.List;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface RouterSenderService {

    @WebMethod
    void notifyUser(String user, String message);

    @WebMethod
    List<String> getAdmins();

    @WebMethod
    List<String> getLecturers();

    @WebMethod
    List<String> getThreeDaysNotTrackingUsers();

    @WebMethod
    List<String> getOneDaysNotTrackingUsers();

    @WebMethod
    List<Report> getReportsToday();

    @WebMethod
    List<String> getUserNamesByRole(String roleName);

    @WebMethod
    void pdf(byte[] pdfBytes, List<String> lectorNickName) throws IOException;
}
