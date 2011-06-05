package test;

/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011, Red Hat, Inc. and/or its affiliates, and individual
 * contributors by the @authors tag. See the copyright.txt in the
 * distribution for a full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.ConversationScoped;
import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;

import org.jboss.seam.solder.core.ExtensionManaged;
public class EntityManagerProvider {
	//private static EntityManagerFactory emf=Persistence.createEntityManagerFactory("seamPersistencePu");
	@ExtensionManaged
	@Produces
	@PersistenceUnit(unitName="seamPersistencePu")
	//@ApplicationScoped
	//@Dependent
	EntityManagerFactory emf;
	
	//@ExtensionManaged
//	@Produces
//	public EntityManager create() {
//		return emf.createEntityManager();
//	}

//	public void close(@Disposes EntityManager em) {
//		em.close();
//	}
}
