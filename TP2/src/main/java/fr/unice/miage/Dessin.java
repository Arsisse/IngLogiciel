package fr.unice.miage;

import com.indvd00m.ascii.render.Render;
import com.indvd00m.ascii.render.api.ICanvas;
import com.indvd00m.ascii.render.api.IContextBuilder;
import com.indvd00m.ascii.render.api.IElement;
import com.indvd00m.ascii.render.api.IRender;
import com.indvd00m.ascii.render.elements.Rectangle;

import java.awt.*;

/**
 * Hello world!
 *
 */
public class Dessin
{
    public static void main( String[] args )
    {
        IRender render = new Render();
		IContextBuilder builder = render.newBuilder();
		builder.width(20).height(10);
		builder.element(new Rectangle());
		ICanvas canvas = render.render(builder.build());
		String s = canvas.getText();
		System.out.println(s);
    }
}

