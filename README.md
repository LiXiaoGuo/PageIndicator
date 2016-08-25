# PageIndicator
viewpager的指示器

修改于[H07000223/FlycoPageIndicator](https://github.com/H07000223/FlycoPageIndicator)

## Demo
![](https://github.com/H07000223/FlycoPageIndicator/blob/master/preview_FlycoPageIndicator.gif)

## 修改内容
 * 取消对[nineoldandroids]()的引用，不再支持API11以下的系统
 * 修正广告轮播时，指示器的错误
  ```
  public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        if (!isSnap) {
            this.currentItem = position%this.count;

            float tranlationX = (indicatorWidth + indicatorGap) * (currentItem + positionOffset);
            if(currentItem == this.count-1 && positionOffset!=0){
                tranlationX = 0;
            }
            selectView.setX(tranlationX);
        }
 }
  ```

## Gradle依赖

```groovy
compile 'com.liguo:pageindicators:0.0.1'
```

### FreePageIndicaor Attributes

|name|format|description|
|:---:|:---:|:---:|
| fpi_width | dimension | indicator width, unit dp,default 6dp|
| fpi_height | dimension | indicator height,unit dp,default 6dp|
| fpi_gap | dimension | indicator space between two indicators,unit dp,default 6dp|
| fpi_strokeWidth | dimension | width of the stroke used to draw the indicators,default 0dp|
| fpi_strokeColor | color | color of the stroke used to draw the indicators,default "#ffffff"|
| fpi_isSnap | boolean | Whether or not the selected indicator snaps to the indicators,default false|
| fpi_selectColor | color | indicator select color ,default "#ffffff"|
| fpi_unselectColor | color | indicator unselect color ,default "#88ffffff"|
| fpi_cornerRadius | dimension | indicator corner raduis ,unit dp,default 3dp|
| fpi_selectRes | reference | indicator select drawable resource|
| fpi_unselectRes | reference | indicator unselect drawable resource|
