package com.task.mihir.mytask;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class firstHomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_home_screen);
        final ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        final TabLayout tabLayout = (TabLayout) findViewById(R.id.tablayout);
        viewPager.setOffscreenPageLimit(3);
        setupViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);


    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        CallsFragment callsFragment=new CallsFragment();
        ChatFragment  chatFragment=new ChatFragment();
        ContactsFragment contactsFragment=new ContactsFragment();
        adapter.addFragment(callsFragment,"CALLS");
        adapter.addFragment(chatFragment,"CHAT");
        adapter.addFragment(contactsFragment,"CONTACTS");
        viewPager.setAdapter(adapter);
    }


}

