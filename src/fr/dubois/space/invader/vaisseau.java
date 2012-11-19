/*création du vaisseau alien Marine */



package fr.dubois.space.invader;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

public class vaisseau {

	public vaisseau() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub



super(context, attrs, defStyle);
initSpaceInvadersView();
}

private static void initSpaceInvadersView() {
setFocusable(true); }
private static void setFocusable(boolean b) {
	// TODO Auto-generated method stub
	
}

private void loadImage(String vaisseau2, Drawable drawable) {
	// TODO Auto-generated method stub
	
}
private void resetImage(int i) {

	// TODO Auto-generated method stub
Resources r = ((Object) this.getContext()).getResources();

resetImage(4);
String vaisseau;


loadImage(vaisseau, r.getDrawable(R.drawable.vaisseau)); 


}

private Object getContext() {
	// TODO Auto-generated method stub
	return null;
}


public void act() {
}



}

