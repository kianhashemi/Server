package org.bihe.service;

import java.io.Serializable;

import org.bihe.bean.Person;

public interface Service extends Serializable {
	static final long serialVersionUID = 7245560613798191609L;
	Service execute(Object object);

}
