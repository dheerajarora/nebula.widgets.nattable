/*******************************************************************************
 * Copyright (c) 2012 Original authors and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Original authors and others - initial API and implementation
 ******************************************************************************/
package org.eclipse.nebula.widgets.nattable.columnRename.event;

import java.util.Arrays;

import org.eclipse.nebula.widgets.nattable.coordinate.PositionUtil;
import org.eclipse.nebula.widgets.nattable.grid.layer.ColumnHeaderLayer;
import org.eclipse.nebula.widgets.nattable.layer.event.ColumnVisualChangeEvent;
import org.eclipse.nebula.widgets.nattable.layer.event.ILayerEvent;


public class RenameColumnHeaderEvent extends ColumnVisualChangeEvent {
    
	public RenameColumnHeaderEvent(ColumnHeaderLayer columnHeaderLayer, int columnPosition)	{
		super(columnHeaderLayer,PositionUtil.getRanges(Arrays.asList(Integer.valueOf(columnPosition))));
	}
	
	// Copy constructor
	protected RenameColumnHeaderEvent(RenameColumnHeaderEvent event) {
		super(event);
	}

	public ILayerEvent cloneEvent() {
		return new RenameColumnHeaderEvent(this);	
	}	
}
