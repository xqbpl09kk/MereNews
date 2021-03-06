package androidnews.kiloproject.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.os.Build;

public class GlideUtil {
    @TargetApi(17)
    public static boolean isValidContextForGlide(final Context context) {
        if (context == null) {
            return false;
        }
        if (context instanceof Activity) {
            final Activity activity = (Activity) context;
            if ((Build.VERSION.SDK_INT > 16 && activity.isDestroyed()) || activity.isFinishing()) {
                return false;
            }
        }
        return true;
    }
}
