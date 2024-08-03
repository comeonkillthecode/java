const { default: axios } = require("axios");

portfoilo = [
    {
        "name": "Tata Digital India -Reg-G",
        "code": "16142"
    },
    {
        "name": "Nippon India Small Cap -G",
        "code": "1670"
    },
    {
        "name": "Motilal Oswal Midcap -Reg-G",
        "code": "3005"
    },
    {
        "name": "Quant ELSS Tax Saver -G",
        "code": "853"
    },
    {
        "name": "DSP ELSS Tax Saver -Reg-G",
        "code": "775"
    },
    {
        "name": "Kotak Bluechip -IDCW D Reinvest",
        "code": "2942"
    },
    {
        "name": "Motilal Oswal Small Cap -Reg-G",
        "code": "74574"
    }
];

const getOverlapHoldingsFor2Funds = async(fund1_id, fund2_id) => {
    return axios.post("https://www.thefundoo.com/PortfolioOverlap.aspx/getPOverlapData", {fundID_1: fund1_id, fundID_2: fund2_id})
    .then(respone => {
        return respone.data.d.split("|")[1];
    })
}

const getOverlapPortfoilo = async(list) => {
    let n = list.length;
    for(i=0;i<n-1;i++){
        for(j=i+1; j<n;j++){
            let val = await getOverlapHoldingsFor2Funds(list[i]["code"], list[j]["code"]);
            console.log("Holding Match between "+ list[i]["name"]+ " and " + list[j]["name"]+ " is " + val);
        }
    }
}

getOverlapPortfoilo(portfoilo);