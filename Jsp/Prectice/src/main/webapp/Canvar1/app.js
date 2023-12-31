import { Point } from "./point.js";
import { Dialog } from "./dialog.js";
class App{
    constructor(){
        this.canvas = document.createElement('canvas');
        document.body.appendChild(this.canvas);
        this.ctx = this.canvas.getContext('2d');
		
		
		//고화질디스플레이 에서는 2반환 나머지 1반환 EX)핸드폰
        this.pixeRatio = window.devicePixelRatio > 1 ? 2 : 1;

        this.mousePos = new Point();
        this.curItem = null;
		
		//캔버스생성
        this.items = [];
        this.total = 5;
        for(let i = 0; i < this.total; i++){
            this.items[i] = new Dialog();
        }

        window.addEventListener('resize',this.resize.bind(this),false);
        this.resize();
	
		//시도떄도없이만들어내면 부하가발생할수있기때문에request를사용해주면서 1초에60번동작으로 제한둠
        window.requestAnimationFrame(this.animate.bind(this));
        document.addEventListener('pointerdown',this.onDown.bind(this),false);
        document.addEventListener('pointermove',this.onMove.bind(this),false);
        document.addEventListener('pointerup',  this.onUp.bind(this),false);

    }
    
    resize(){
        this.stageWidth = document.body.clientWidth;
        this.stageHeight = document.body.clientHeight;

        this.canvas.width = this.stageWidth * this.pixeRatio;
        this.canvas.height = this.stageHeight * this.pixeRatio;
        this.ctx.scale(this.pixeRatio, this.pixeRatio);

        this.ctx.shadowOffsetX = 0;
        this.ctx.shadowOffsetY = 0;
        this.ctx.shadowBlur = 6;
        this.ctx.shadowColor = `rgba(0,0,0,0.1)` ;
        this.ctx.lineWidth = 2;

        for(let i = 0; i < this.items.length; i++){
            this.items[i].resize(this.stageWidth,this.stageHeight);
        }   
    }
    animate(){
        window.requestAnimationFrame(this.animate.bind(this));
        this.ctx.clearRect(0,0,this.stageWidth,this.stageHeight);

        for(let i = 0; i<this.items.length; i++){
            this.items[i].animate(this.ctx);
        }
        if(this.curItem){
            //점과 선 색
            this.ctx.fillStyle = `#ff4338`;
            this.ctx.strokeStyle = `#ff4338`;


            this.ctx.beginPath();
            this.ctx.arc(this.mousePos.x,this.mousePos.y,8,0,Math.PI * 2);
            this.ctx.fill();

            this.ctx.beginPath();
            this.ctx.arc(this.curItem.centerPos.x,this.curItem.centerPos.y,8,0,Math.PI * 2);
            this.ctx.fill();
            
           

            this.ctx.beginPath();
            this.ctx.moveTo(this.mousePos.x,this.mousePos.y);
            this.ctx.lineTo(this.curItem.centerPos.x,this.curItem.centerPos.y);
            this.ctx.stroke();
        }
    }

    onDown(e){
        this.mousePos.x = e.clientX;
        this.mousePos.y = e.clientY;

        for(let i = this.items.length -1; i>=0; i--){
            const item = this.items[i].down(this.mousePos.clone());
            if(item){
                this.curItem = item;
                const index = this.items.indexOf(item);
                this.items.push(this.items.splice(index,1)[0]);
                break;
            }
        }
    }
    onMove(e){
        this.mousePos.x = e.clientX;
        this.mousePos.y = e.clientY;

        for(let i = 0; i<this.items.length; i++){
            this.items[i].move(this.mousePos.clone());
        }
    }
    onUp(e){
     this.curItem = null;
     for(let i = 0; i<this.items.length; i++){
        this.items[i].up();
    }
    }
}

window.onload = () =>{
    new App();
};