package com.aaron.rpc.server;

import com.aaron.rpc.api.dto.Person;
import com.aaron.rpc.api.service.HelloService;
import com.aaron.tools.rpc.server.RpcService;

@RpcService(HelloService.class)
public class HelloServiceImpl implements HelloService {

    @Override
    public String hello(String name) {
        return "Hello! " + name;
    }

    @Override
    public String hello(Person person) {
        return "Hello! " + person.getFirstName() + " " + person.getLastName();
    }
}
