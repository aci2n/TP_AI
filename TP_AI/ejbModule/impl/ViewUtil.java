package impl;

public class ViewUtil {
	public static <T> T getViewChecked(ViewGenerator<T> viewGenerator) {
		if (viewGenerator != null) {
			return viewGenerator.getView();
		}
		return null;
	}
}
