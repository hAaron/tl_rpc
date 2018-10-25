package com.aaron.rpc.api.service;

import com.aaron.rpc.api.dto.Person;

public interface HelloService {

    String hello(String name);

    String hello(Person person);
}
