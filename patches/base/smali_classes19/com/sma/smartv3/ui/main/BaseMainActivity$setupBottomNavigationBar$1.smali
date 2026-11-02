.class public final Lcom/sma/smartv3/ui/main/BaseMainActivity$setupBottomNavigationBar$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/main/BaseMainActivity;->setupBottomNavigationBar()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/sma/smartv3/ui/main/BaseMainActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/main/BaseMainActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/main/BaseMainActivity$setupBottomNavigationBar$1;->this$0:Lcom/sma/smartv3/ui/main/BaseMainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPageScrollStateChanged(I)V
    .locals 0

    return-void
.end method

.method public onPageScrolled(IFI)V
    .locals 0

    return-void
.end method

.method public onPageSelected(I)V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/main/BaseMainActivity$setupBottomNavigationBar$1;->this$0:Lcom/sma/smartv3/ui/main/BaseMainActivity;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/main/BaseMainActivity;->getBottomNav()Lcom/google/android/material/bottomnavigation/BottomNavigationView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/material/navigation/NavigationBarView;->getMenu()Landroid/view/Menu;

    move-result-object v0

    invoke-interface {v0, p1}, Landroid/view/Menu;->getItem(I)Landroid/view/MenuItem;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    iget-object v0, p0, Lcom/sma/smartv3/ui/main/BaseMainActivity$setupBottomNavigationBar$1;->this$0:Lcom/sma/smartv3/ui/main/BaseMainActivity;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/main/BaseMainActivity;->clearSubContent()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/main/BaseMainActivity$setupBottomNavigationBar$1;->this$0:Lcom/sma/smartv3/ui/main/BaseMainActivity;

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/ui/main/BaseMainActivity;->viewPagerSelected(I)V

    return-void
.end method
