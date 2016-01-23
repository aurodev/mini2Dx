/**
 * Copyright 2015 Thomas Cashman
 */
package org.mini2Dx.ui.element;

import org.mini2Dx.ui.render.AbsoluteModalRenderNode;
import org.mini2Dx.ui.render.ParentRenderNode;

/**
 *
 */
public class AbsoluteModal extends Modal {
	private float x, y;
	
	public AbsoluteModal() {
		this(null);
	}
	
	public AbsoluteModal(String id) {
		super(id);
	}
	
	@Override
	public void attach(ParentRenderNode<?, ?> parentRenderNode) {
		if(renderNode != null) {
			return;
		}
		renderNode = new AbsoluteModalRenderNode(parentRenderNode, this);
		for(int i = 0; i < children.size(); i++) {
			children.get(i).attach(renderNode);
		}
		parentRenderNode.addChild(renderNode);
	}
	
	public float getX() {
		return x;
	}

	public void setX(float x) {
		if(this.x == x) {
			return;
		}
		this.x = x;
		
		if(renderNode == null) {
			return;
		}
		renderNode.setDirty(true);
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		if(this.y == y) {
			return;
		}
		this.y = y;
		
		if(renderNode == null) {
			return;
		}
		renderNode.setDirty(true);
	}
	
	public void set(float x, float y) {
		if(this.x == x && this.y == y) {
			return;
		}
		this.x = x;
		this.y = y;
		
		if(renderNode == null) {
			return;
		}
		renderNode.setDirty(true);
	}
	
	public float getWidth() {
		if(renderNode == null) {
			return 0f;
		}
		return renderNode.getWidth();
	}
	
	public float getHeight() {
		if(renderNode == null) {
			return 0f;
		}
		return renderNode.getHeight();
	}
}