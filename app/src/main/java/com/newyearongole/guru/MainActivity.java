package com.newyearongole.guru;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import com.github.clans.fab.FloatingActionMenu;

public class MainActivity extends AppCompatActivity {

    FloatingActionMenu mainMenu;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainMenu = (FloatingActionMenu) findViewById(R.id.main_fab);
        mainMenu.setClosedOnTouchOutside(true);


        WebView webView1 = (WebView) findViewById(R.id.mywebview);
        WebSettings webSettings = webView1.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView1.setWebViewClient(new WebViewClient());


        String myhtmlcode = "<!DOCTYPE HTML>\n" +
                "<html>\n" +
                "<head>\n" +
                "<h1>New Year 2018</h1>\n" +
                "<h2>CountDown Ongole</h2>\n" +
                "\n" +
                "<style>\n" +
                "h1{\n" +
                "\n" +
                "color:#FFFFFF;\n" +
                "text-align:center;\n" +
                "font-size:40px;\n" +
                "font-family:sans-serif;\n" +
                "border:10px double #F73B01;\n" +
                "}\n" +
                "h2{\n" +
                "\n" +
                "color:#FFFFFF;\n" +
                "text-align:center;\n" +
                "font-size:40px;\n" +
                "font-family:sans-serif;\n" +
                "border:10px double #FD8D01;\n" +
                "\n" +
                "}\n" +
                "\n" +
                "body {\n" +
                "\n" +
                "background-color: #292826;\n" +
                "\n" +
                "}\n" +
                "\n" +
                "p {\n" +
                "color:#FFFFFF;\n" +
                "margin-top:50px;\n" +
                "  text-align: center;\n" +
                "  font-size: 15px;\n" +
                "  font-family:sans-serif;\n" +
                "  border:10px double #FEB901;\n" +
                "}\n" +
                "</style>\n" +
                "</head>\n" +
                "<body>\n" +
                "\n" +
                "<p id=\"demo\"></p>\n" +
                "\n" +
                "<script>\n" +
                "// Set the date we're counting down to\n" +
                "var countDownDate = new Date(\"Jan 1, 2018 00:00:00\").getTime();\n" +
                "\n" +
                "// Update the count down every 1 second\n" +
                "var x = setInterval(function() {\n" +
                "\n" +
                "    // Get todays date and time\n" +
                "    var now = new Date().getTime();\n" +
                "    \n" +
                "    // Find the distance between now an the count down date\n" +
                "    var distance = countDownDate - now;\n" +
                "    \n" +
                "    // Time calculations for days, hours, minutes and seconds\n" +
                "    var days = Math.floor(distance / (1000 * 60 * 60 * 24));\n" +
                "    var hours = Math.floor((distance % (1000 * 60 * 60 * 24)) / (1000 * 60 * 60));\n" +
                "    var minutes = Math.floor((distance % (1000 * 60 * 60)) / (1000 * 60));\n" +
                "    var seconds = Math.floor((distance % (1000 * 60)) / 1000);\n" +
                "    \n" +
                "    // Output the result in an element with id=\"demo\"\n" +
                "    document.getElementById(\"demo\").innerHTML = days + \"D \" + hours + \"H \"\n" +
                "    + minutes + \"M \" + seconds + \"S \";\n" +
                "    \n" +
                "    // If the count down is over, write some text \n" +
                "    if (distance < 0) {\n" +
                "        clearInterval(x);\n" +
                "        document.getElementById(\"demo\").innerHTML = \"Happy New Year !!!!\";\n" +
                "    }\n" +
                "}, 1000);\n" +
                "</script>\n" +
                "</body>\n" +
                "</html>\n";
        webView1.loadData(myhtmlcode, "text/html", "utf-8");
    }

    public void sendMessage(View view)

    {
        Intent intent = new Intent(MainActivity.this, swipeview.class);
        startActivity(intent);
    }


    public void facebook(View view) {

        Intent facebookIntent = gotoFacebookIntent(MainActivity.this);
        startActivity(facebookIntent);

        Toast.makeText(this, "Clicked Facebook", Toast.LENGTH_SHORT).show();

    }

    public void twitter(View view) {

        Intent youtubeIntent = gotoTwitterIntent(MainActivity.this);
        startActivity(youtubeIntent);

        Toast.makeText(this, "Clicked Twitter", Toast.LENGTH_SHORT).show();

    }

    public void instagram(View view) {

        Intent instagramIntent = gotoInstagramIntent(MainActivity.this);
        startActivity(instagramIntent);

        Toast.makeText(this, "Clicked Instagram", Toast.LENGTH_SHORT).show();

    }

    public void linkedIn(View view) {

        Intent linkkedIntent = gotoLinkdinIntent(MainActivity.this);
        startActivity(linkkedIntent);

        Toast.makeText(this, "Clicked LinkedIn", Toast.LENGTH_SHORT).show();

    }




    public static Intent gotoTwitterIntent(Context context) {

        try {

            context.getPackageManager()
                    .getPackageInfo("com.twitter.android", 0); //Checks if YT is even installed.
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://twitter.com/guruprakash43")); //Trys to make intent with YT's URI
        } catch (Exception e) {
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://twitter.com/guruprakash43")); //catches and opens a url to the desired page
        }

    }

    public static Intent gotoFacebookIntent(Context context) {

        try {
            context.getPackageManager()
                    .getPackageInfo("com.facebook.katana", 0); //Checks if FB is even installed.
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.facebook.com/guruprakash.adimulam")); //Trys to make intent with FB's URI
        } catch (Exception e) {

            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.facebook.com/guruprakash.adimulam")); //catches and opens a url to the desired page
        }
    }

    public static Intent gotoLinkdinIntent(Context context) {

        try {
            context.getPackageManager()
                    .getPackageInfo("com.linkedin.android", 0); //Checks if Linkdin is even installed.
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.linkedin.com/in/guruprakashadimulam")); //Trys to make intent with Linkdin's URI
        } catch (Exception e) {

            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.linkedin.com/in/guruprakashadimulam")); //catches and opens a url to the desired page
        }
    }

    public static Intent gotoInstagramIntent(Context context) {

        try {
            context.getPackageManager()
                    .getPackageInfo("com.instagram.android", 0); //Checks if Instagram is even installed.
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.instagram.com/guruprakash.adimulam")); //Trys to make intent with Instagram's URI
        } catch (Exception e) {
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.instagram.com/guruprakash.adimulam")); //catches and opens a url to the desired page
        }
    }



    @Override
    public void onBackPressed() {

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setMessage("Are You Sure, You wanted to EXIT");
        alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface arg0, int arg1)
            {

                MainActivity.this.finish();
                arg0.dismiss();

            }
        });

        alertDialogBuilder.setNegativeButton("No",new DialogInterface.OnClickListener()
        {

            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                dialog.dismiss();
            }

        });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();

    }

}
