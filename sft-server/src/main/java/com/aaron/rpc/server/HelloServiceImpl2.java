package com.aaron.rpc.server;

import com.aaron.rpc.api.dto.Person;
import com.aaron.rpc.api.service.HelloService;
import com.aaron.tools.rpc.server.RpcService;

@RpcService(value = HelloService.class, version = "sample.hello2")
public class HelloServiceImpl2 implements HelloService {

    @Override
    public String hello(String name) {
        return "你好! " + name;
    }

    @Override
    public String hello(Person person) {
        return "你好! " + person.getFirstName() + " " + person.getLastName();
    }
}
