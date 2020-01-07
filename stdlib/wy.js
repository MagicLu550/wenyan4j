var index = 0;
var 圖靈機 = function(諸律) {
    index++;
    return function(始態) {
        return function(終態) {
            var 帶 = [];
            帶.push("白");
            var 針 = 1;
            var 左疆 = 1;
            var 右疆 = 1;
            var 態 = 始態;
            var 圖靈機畫法 = function() {
                var 畫帶 = "";
                var 筆 = 左疆;
                while (true) {
                    if (筆 > 右疆) {
                        break;
                    };
                    var _ans1 = 帶[筆 - 1];
                    var 符 = _ans1;
                    if (針 == 筆) {
                        var _ans2 = "〔" + 符;
                        var _ans3 = _ans2 + "〕";
                        符 = _ans3;
                    } else {
                        var _ans4 = "、" + 符;
                        var _ans5 = _ans4 + "、";
                        符 = _ans5;
                    };
                    var _ans6 = 畫帶 + 符;
                    畫帶 = _ans6;
                    var _ans7 = 1 + 筆;
                    筆 = _ans7;
                };
                var _ans8 = 態;
                var _ans9 = "《";
                var _ans10 = 畫帶;
                var _ans11 = "》";
                console.log(_ans8, _ans9, _ans10, _ans11);
            };
            var _ans12 = 圖靈機畫法();
            while (true) {
                for (var 律 of 諸律) {
                    var _ans13 = 律[1 - 1];
                    var 甲態 = _ans13;
                    var _ans14 = 律[2 - 1];
                    var 讀符 = _ans14;
                    var _ans15 = 律[3 - 1];
                    var 乙態 = _ans15;
                    var _ans16 = 律[4 - 1];
                    var 畫符 = _ans16;
                    var _ans17 = 律[5 - 1];
                    var 移 = _ans17;
                    if (態 == 甲態) {

                        if (帶[針 - 1] == 讀符) {
                            帶[針 - 1] = 畫符;
                            態 = 乙態;
                            if (移 == "左") {
                                var _ans18 = 針 - 1;
                                針 = _ans18;
                            };
                            if (移 == "右") {
                                var _ans19 = 針 + 1;
                                針 = _ans19;
                            };
                            break;
                        };
                    };
                };
                if (針 < 左疆) {
                    帶[針 - 1] = "白";
                    左疆 = 針;
                };
                if (針 > 右疆) {
                    帶[針 - 1] = "白";
                    右疆 = 針;
                };
                var _ans20 = 圖靈機畫法();
                if (態 == 終態) {
                    break;
                };
            };
        };
    };
};
var 製律 = () => 0;
製律 = function(諸律) {
    return function(甲態) {
        return function(讀符) {
            return function(乙態) {
                return function(畫符) {
                    return function(移) {
                        var 律 = [];
                        律.push(甲態, 讀符, 乙態, 畫符, 移);
                        諸律.push(律);
                    };
                };
            };
        };
    };
};
var _ans21 = "營營河狸。止于樊。";
console.log(_ans21);
var 諸律 = [];
var 陽符 = "墨";
var 陰符 = "白";
var _ans22 = 製律(諸律)("甲")(陰符)("乙")(陽符)("右");
var _ans23 = 製律(諸律)("甲")(陽符)("丙")(陽符)("左");
var _ans24 = 製律(諸律)("乙")(陰符)("甲")(陽符)("左");
var _ans25 = 製律(諸律)("乙")(陽符)("乙")(陽符)("右");
var _ans26 = 製律(諸律)("丙")(陰符)("乙")(陽符)("左");
var _ans27 = 製律(諸律)("丙")(陽符)("樊")(陽符)("中");
var _ans28 = 圖靈機(諸律)("甲")("樊");