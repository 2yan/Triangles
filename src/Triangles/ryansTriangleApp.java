package Triangles;

import java.nio.FloatBuffer;

import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;
import org.lwjgl.util.Color;

import RenderEngine.DisplayManager;
import RenderEngine.Renderer;

public class ryansTriangleApp {
	
	
	
public static void main(String[] args) {
	DisplayManager.createDisplay();
	System.out.println("OpenGL version: " + GL11.glGetString(GL11.GL_VERSION));
	
	
	

	
	
	
	while(!Display.isCloseRequested()) {
		
		Renderer.prepare();
		
		

		
		
		DisplayManager.updateDisplay();
	}
	
	DisplayManager.closeDisplay();
}
	
}
