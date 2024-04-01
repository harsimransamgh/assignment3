package com.businesscard.mobile

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.recyclerview.widget.RecyclerView
import com.businesscard.mobile.model.Tip
import com.businesscard.mobile.ui.theme.MobileTheme

class MainActivity : ComponentActivity() {
    private lateinit var tipsRecyclerView: RecyclerView
    private lateinit var tipsAdapter: TipAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tipsList = listOf(
            Tip("Practice Gratitude", "Start your day by writing down three things you're grateful for.", R.drawable.gratitude),
            Tip("Hydrate Frequently", "Drink at least 8 glasses of water throughout the day.", R.drawable.hydrate),
            Tip("Stretch Regularly", "Take short breaks to stretch and relieve muscle tension.", R.drawable.exercise),
            Tip("Mindful Eating", "Focus on your meal, savor each bite, and listen to hunger cues.", R.drawable.eating),
            Tip("Daily Exercise", "Dedicate at least 30 minutes to physical activity.", R.drawable.exercise),
            Tip("Quality Sleep", "Aim for 7-9 hours of quality sleep each night.", R.drawable.sleep),
            Tip("Positive Affirmations", "Start your morning with positive affirmations to set the tone for the day.", R.drawable.positive),
            Tip("Digital Detox", "Spend an hour before bed away from screens.", R.drawable.screen),
            Tip("Nature Walks", "Connect with nature by taking a walk in a green space.", R.drawable.outside),
            Tip("Deep Breathing", "Practice deep breathing exercises to reduce stress.", R.drawable.breathing),
            Tip("Healthy Snacking", "Choose whole, nutritious snacks to fuel your body.", R.drawable.eating),
            Tip("Creative Outlet", "Dedicate time to a hobby that allows you to express creativity.", R.drawable.creative),
            Tip("Social Connection", "Reach out to a friend or family member for a chat.", R.drawable.connect),
            Tip("Learning Something New", "Challenge your brain by learning a new skill or topic.", R.drawable.learn),
            Tip("Financial Planning", "Spend time each week planning your finances for peace of mind.", R.drawable.mindfulness),
            Tip("Mindfulness Meditation", "Incorporate a 10-minute mindfulness meditation into your daily routine.", R.drawable.meditation),
            Tip("Joyful Movement", "Find a form of exercise you enjoy and look forward to doing.", R.drawable.goal),
            Tip("Reading Time", "Dedicate time to read books that interest you.", R.drawable.creative),
            Tip("Gratitude Journal", "End your day by jotting down moments you were grateful for.", R.drawable.gratitude),
            Tip("Sustainable Living", "Make one sustainable choice each day to impact the planet positively.", R.drawable.kind),
            Tip("Self-Care Rituals", "Create a self-care ritual that makes you feel pampered and cared for.", R.drawable.care),
            Tip("Goal Setting", "Set and review weekly goals to stay focused on your personal growth.", R.drawable.goal),
            Tip("Laugh Often", "Seek out humor every day to keep your spirits high.", R.drawable.active),
            Tip("Volunteer Work", "Give back to your community with volunteer work.", R.drawable.learn),
            Tip("Stay Hydrated", "Keep a water bottle with you and sip throughout the day.", R.drawable.hydrate),
            Tip("Balanced Diet", "Focus on a balanced diet rich in fruits, vegetables, and whole grains.", R.drawable.eating),
            Tip("Sunshine and Vitamin D", "Spend a few minutes in the sun to get your daily dose of Vitamin D.", R.drawable.outside),
            Tip("Adequate Rest", "Listen to your body and rest when you need to recharge.", R.drawable.sleep),
            Tip("Personal Reflection", "Reflect on your day, noting what went well and what could be improved.", R.drawable.self),
            Tip("Positive Social Media", "Consume social media content that inspires and uplifts you.", R.drawable.connect)
        )

        tipsRecyclerView = findViewById(R.id.tips_recycler_view)
        tipsAdapter = TipAdapter(tipsList)
        tipsRecyclerView.adapter = tipsAdapter
    }
}