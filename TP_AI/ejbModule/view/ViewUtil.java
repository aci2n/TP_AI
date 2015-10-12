package view;

import impl.ViewGenerator;

public class ViewUtil {
	public static <T> T getViewChecked(ViewGenerator<T> objectView) {
		if (objectView != null) {
			return objectView.getView();
		}
		return null;
	}
}
