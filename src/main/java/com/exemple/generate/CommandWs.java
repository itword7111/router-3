
package com.exemple.generate;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CommandWs", targetNamespace = "http://command_web_service.example.com/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CommandWs {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://command_web_service.example.com/CommandWs/getRoleNameByUserNameRequest", output = "http://command_web_service.example.com/CommandWs/getRoleNameByUserNameResponse")
    public String getRoleNameByUserName(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @Action(input = "http://command_web_service.example.com/CommandWs/putChatIdByUserNameRequest", output = "http://command_web_service.example.com/CommandWs/putChatIdByUserNameResponse")
    public void putChatIdByUserName(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns com.exemple.generate.ListOfString
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://command_web_service.example.com/CommandWs/getListOfChatIdByRoleNameRequest", output = "http://command_web_service.example.com/CommandWs/getListOfChatIdByRoleNameResponse")
    public ListOfString getListOfChatIdByRoleName(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns com.exemple.generate.ListOfString
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://command_web_service.example.com/CommandWs/getUserNameListByRoleNameRequest", output = "http://command_web_service.example.com/CommandWs/getUserNameListByRoleNameResponse")
    public ListOfString getUserNameListByRoleName(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns com.exemple.generate.ListOfString
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://command_web_service.example.com/CommandWs/getListOfUsersByGroupNameRequest", output = "http://command_web_service.example.com/CommandWs/getListOfUsersByGroupNameResponse")
    public ListOfString getListOfUsersByGroupName(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @Action(input = "http://command_web_service.example.com/CommandWs/insertUserRequest", output = "http://command_web_service.example.com/CommandWs/insertUserResponse")
    public void insertUser(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        String arg2);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @Action(input = "http://command_web_service.example.com/CommandWs/insertGroupRequest", output = "http://command_web_service.example.com/CommandWs/insertGroupResponse")
    public void insertGroup(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0);

    /**
     * 
     * @return
     *     returns com.exemple.generate.ListOfString
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://command_web_service.example.com/CommandWs/getGroupsRequest", output = "http://command_web_service.example.com/CommandWs/getGroupsResponse")
    public ListOfString getGroups();

    /**
     * 
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @Action(input = "http://command_web_service.example.com/CommandWs/updateGroupRequest", output = "http://command_web_service.example.com/CommandWs/updateGroupResponse")
    public void updateGroup(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @Action(input = "http://command_web_service.example.com/CommandWs/deleteGroupRequest", output = "http://command_web_service.example.com/CommandWs/deleteGroupResponse")
    public void deleteGroup(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @Action(input = "http://command_web_service.example.com/CommandWs/updateUserRequest", output = "http://command_web_service.example.com/CommandWs/updateUserResponse")
    public void updateUser(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        String arg2);

    /**
     * 
     * @return
     *     returns com.exemple.generate.ListOfString
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://command_web_service.example.com/CommandWs/getListOfUsersRequest", output = "http://command_web_service.example.com/CommandWs/getListOfUsersResponse")
    public ListOfString getListOfUsers();

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @Action(input = "http://command_web_service.example.com/CommandWs/deleteUserRequest", output = "http://command_web_service.example.com/CommandWs/deleteUserResponse")
    public void deleteUser(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0);

}
