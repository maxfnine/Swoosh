package com.example.swoosh

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onMensClicked(view:View){
        womensLeagueButton.isChecked = false
        coedLeagueButton.isChecked = false
        selectedLeague = "mens"
    }

    fun onWomensClicked(view:View){
        mensLeagueButton.isChecked = false
        coedLeagueButton.isChecked = false
        selectedLeague = "womens"
    }

    fun onCoedClicked(view:View){
        mensLeagueButton.isChecked = false
        womensLeagueButton.isChecked = false
        selectedLeague = "co-ed"

    }

    fun leagueNextClicked(view:View){
        if(selectedLeague != ""){
            val skillActivityIntent = Intent(this,SkillActivity::class.java)
            skillActivityIntent.putExtra(EXTRA_LEAGUE,selectedLeague)
            startActivity(skillActivityIntent)
        }else{
            Toast.makeText(this,"Please select a league.",Toast.LENGTH_SHORT).show()
        }

    }

}
