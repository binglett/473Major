/*******************************************************************************
 *  Imixs-Workflow 
 *  Copyright (C) 2001, 2016 Imixs Software Solutions GmbH,  
 *  http://www.imixs.com
 *  
 *  This program is free software; you can redistribute it and/or 
 *  modify it under the terms of the GNU General Public License 
 *  as published by the Free Software Foundation; either version 2 
 *  of the License, or (at your option) any later version.
 *  
 *  This program is distributed in the hope that it will be useful, 
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of 
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU 
 *  General Public License for more details.
 *  
 *  You can receive a copy of the GNU General Public
 *  License at http://www.gnu.org/licenses/gpl.html
 *  
 *  Project: 
 *  	http://www.imixs.org
 *  
 *  Contributors:  
 *  	Imixs Software Solutions GmbH - initial API and implementation
 *  	Ralph Soika - Software Developer
 *******************************************************************************/

package org.imixs.workflow;

import org.imixs.workflow.exceptions.ModelException;

/**
 * The IModelManager stores instances of IModel. A IModel instance is uniquely
 * identified by the ModelVersion. The IModelManager is used by the
 * <code>WorkflowKernel</code> to manage the workflow of a workitem.
 * 
 * By analyzing the workitem model version the Workflowkernel determines the
 * corresponding model and get the Tasks and Events from the model to process
 * the workitem and assign the workitem to the next Task defined by the Model.
 * 
 * 
 * @see Model
 * @author rsoika
 *
 */
public interface ModelManager {

	/**
	 * Returns a Model by version. The method throws a ModelException in case
	 * the model version did not exits.
	 * 
	 * @param version
	 * @throws ModelException 
	 * @return Model
	 */
	public Model getModel(String version) throws ModelException;;

	
	/**
	 * Adds a new Model to the ModelManager.
	 * 
	 * @param model
	 * @throws ModelException 
	 */
	public void addModel(Model model)  throws ModelException;;


	/**
	 * Removes a Model from the ModelManager
	 * @param version
	 */
	public void removeModel(String version);


	/**
	 * Returns a Model matching a given workitem. The method throws a ModelException in case
	 * the model version did not exits.
	 * 
	 * @param version
	 * @throws ModelException 
	 * @return Model
	 */
	public Model getModelByWorkitem(ItemCollection workitem) throws ModelException;


}


