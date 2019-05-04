package com.example.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.Utilities.EXTRA_LEAGUE
import com.example.swoosh.R
import com.example.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    var league = ""
    var skill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        league = intent.getStringExtra(EXTRA_LEAGUE)
        println(league)
    }

    fun onBeginnerClicked(view:View){
        ballerSkillButton.isChecked = false
        skill = "beginner"

    }

    fun onBallerClicked(view:View){
        beginnerSkillButton.isChecked = false
        skill = "baller"
    }

    fun onSkillFinishClicked(view: View){
        if(league != ""){
            val finishActivityIntent = Intent(this,FinishActivity::class.java)
            finishActivityIntent.putExtra(EXTRA_SKILL,skill)
            finishActivityIntent.putExtra(EXTRA_LEAGUE,league)
            startActivity(finishActivityIntent)
        }else {
            Toast.makeText(this,"Please select a skill level.",Toast.LENGTH_SHORT).show()
        }


    }


}
