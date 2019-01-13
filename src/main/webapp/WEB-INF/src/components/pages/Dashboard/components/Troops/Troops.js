import React from 'react';
import UnitPurchase from '../subcomponents/UnitPurchase';
import './Troops.scss';

const troops = [
    {
        name: "Spearmen",
        description: "Spearmen are light infantry. Thanks to their light armor, they can carry a lot of loot"
    },
    {
        name: "Archers",
        description: "Archers offer support. While they have light armor, they are generally protected by heavier units."
    },
    {
        name: "Heavy Swords",
        description: "Heavily armored swordsmen are the backbone of any serious army. They have high attack, armor, and health."
    }
]

class Troops extends React.Component {
    constructor() {
        super();
        this.state = {
            unitType: "",
            amount: 0
        }
        this.makePurchase = this.makePurchase.bind(this);
    }

    makePurchase(unitType, amount) {
        //const payload = { unitType, amount }
        console.log(unitType, amount);
        const params = {
            username: "eolculnamo2",  // To do, add username with spring security
            spearmen: 0,
            archers: 0,
            heavySwords: 0
        }

        params[unitType.toLowerCase()] = amount;
        
        const {username, spearmen, archers, heavySwords} = params;
        let paramsString = "username="+username+"&spearmen="+spearmen+"&archers="+archers+"&heavySwords="+heavySwords;
        console.log(paramsString);
        fetch('/purchase-troops?'+paramsString,{
            method: "POST",
            headers: { "Content-Type": "application/json" },
            credentials: "same-origin"
            })
        // .then( res => res.json() )
        // .then( data => {
        //     alert("You purchased " + data.amount + " "+data.unitType);
        // });
    }

    render() {
        return (
            <div className="Troops">
                <h1 className="Dashboard-heading">Troops</h1>
                {troops.map( x => <UnitPurchase  description={ x.description } 
                                                 makePurchase={ this.makePurchase} 
                                                 name={ x.name }/> )}
            </div>
        )
    }
}

export default Troops;