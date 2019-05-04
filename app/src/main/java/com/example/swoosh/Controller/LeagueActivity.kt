package com.example.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.Model.Player
import com.example.swoosh.R
import com.example.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var player = Player("","")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onMensClicked(view:View){
        womensLeagueButton.isChecked = false
        coedLeagueButton.isChecked = false
        player.league = "mens"
    }

    fun onWomensClicked(view:View){
        mensLeagueButton.isChecked = false
        coedLeagueButton.isChecked = false
        player.league = "womens"
    }

    fun onCoedClicked(view:View){
        mensLeagueButton.isChecked = false
        womensLeagueButton.isChecked = false
        player.league = "co-ed"

    }

    fun leagueNextClicked(view:View){
        if(player.league != ""){
            val skillActivityIntent = Intent(this, SkillActivity::class.java)
            skillActivityIntent.putExtra(EXTRA_PLAYER,player)
            startActivity(skillActivityIntent)
        }else{
            Toast.makeText(this,"Please select a league.",Toast.LENGTH_SHORT).show()
        }

    }

}
