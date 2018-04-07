package rbpstudio.simplewidget;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.RemoteViews;

import com.squareup.picasso.Picasso;

import java.io.InputStream;
import java.util.Random;

public class SimpleWidgetProvider extends AppWidgetProvider {

    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        final int count = appWidgetIds.length;

        for (int i = 0; i < count; i++) {
            int widgetId = appWidgetIds[i];

            RemoteViews remoteViews = new RemoteViews(context.getPackageName(),
                    R.layout.simple_widget);

            String url = "https://images.techhive.com/images/article/2016/09/android-old-habits-100682662-primary.idge.jpg";
            Picasso.get().load(url).into(remoteViews, R.id.imageView, appWidgetIds);


            appWidgetManager.updateAppWidget(widgetId, remoteViews);
        }
    }
}