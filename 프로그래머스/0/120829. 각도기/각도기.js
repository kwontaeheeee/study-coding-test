function solution(angle) {
    if(angle < 90){
        console.log("예각");
        return 1;
    }
    else if(angle === 90){
        console.log("직각");
        return 2;
    }
    else if(angle > 90 && angle < 180){
        console.log("둔각");
        return 3;
    }
    else if(angle === 180){
        console.log("평각");
        return 4;
    }
}