# PageIndicator
viewpager的指示器

 修改于[H07000223/FlycoPageIndicator](https://github.com/H07000223/FlycoPageIndicator)

## Demo
![](https://github.com/H07000223/FlycoPageIndicator/blob/master/preview_FlycoPageIndicator.gif)
Demo图片引用于[H07000223/FlycoPageIndicator](https://github.com/H07000223/FlycoPageIndicator)项目

## 修改内容
 * 取消对[nineoldandroids](https://github.com/JakeWharton/NineOldAndroids)的引用，不再支持API11以下的系统
 * 修正广告轮播(无限轮播)时，指示器的错误

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

     public void onPageSelected(int position) {
             if (isSnap) {
                 this.currentItem = position%this.count;

                 for (int i = 0; i < indicatorViews.size(); i++) {
                     indicatorViews.get(i).setImageDrawable(i == currentItem ? selectDrawable : unSelectDrawable);
                 }
                 animSwitch(currentItem);
                 lastItem = currentItem;
             }
         }
  ```
  ```
      public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
          if (!isSnap) {
              currentItem = position%this.count;
              this.positionOffset = positionOffset;
              invalidate();
          }
      }

      public void onPageSelected(int position) {
          if (isSnap) {
              currentItem = position%this.count;
              invalidate();
          }
      }
  ```

## Gradle依赖

```groovy
compile 'com.liguo:pageindicators:0.0.3'
```

### FreePageIndicaor Attributes

|name|format|description|
|:---:|:---:|:---:|
| fpi_width | dimension | 指示器宽度，单位 dp，默认为6dp|
| fpi_height | dimension | 指示器高度，单位 dp，默认为6dp|
| fpi_gap | dimension | 两个指示器之间的间隔，单位 dp，默认为6dp|
| fpi_strokeWidth | dimension | 未选中时线的宽度，默认为0dp|
| fpi_strokeColor | color | 线的颜色，默认颜色为 "#ffffff"|
| fpi_isSnap | boolean | 是否取消滑动效果,默认为 false|
| fpi_selectColor | color | 指示器选中时的颜色 ,默认 "#ffffff"|
| fpi_unselectColor | color | 指示器未选中时的颜色 ,默认 "#88ffffff"|
| fpi_cornerRadius | dimension | 指示器的圆角，默认为 3dp|
| fpi_selectRes | reference | 指示器选中时的资源|
| fpi_unselectRes | reference | 指示器未选中时的资源|
