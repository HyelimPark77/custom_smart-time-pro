.class public Lcom/sma/smartv3/ui/main/BaseMain2Activity;
.super Lcom/sma/smartv3/ui/main/BaseMainActivity;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/main/BaseMainActivity;-><init>()V

    return-void
.end method


# virtual methods
.method public initFragments()Ljava/util/List;
    .locals 5
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroidx/fragment/app/Fragment;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/sma/smartv3/ui/status/MainStatus2Fragment;

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/MainStatus2Fragment;-><init>()V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/main/BaseMainActivity;->setStatusFragment(Lcom/sma/smartv3/ui/status/MainStatusFragment;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/main/BaseMainActivity;->getStatusFragment()Lcom/sma/smartv3/ui/status/MainStatusFragment;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/i72;->IOI0i0I()Z

    move-result v2

    const/4 v3, 0x1

    const v4, 0x7f0a056c

    if-eqz v2, :cond_0

    new-instance v2, Lcom/sma/smartv3/ui/sport/Sport2Fragment;

    invoke-direct {v2}, Lcom/sma/smartv3/ui/sport/Sport2Fragment;-><init>()V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/main/BaseMainActivity;->getBottomNav()Lcom/google/android/material/bottomnavigation/BottomNavigationView;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/material/navigation/NavigationBarView;->getMenu()Landroid/view/Menu;

    move-result-object v2

    invoke-interface {v2, v4}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-interface {v2, v3}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/main/BaseMainActivity;->getBottomNav()Lcom/google/android/material/bottomnavigation/BottomNavigationView;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/material/navigation/NavigationBarView;->getMenu()Landroid/view/Menu;

    move-result-object v2

    invoke-interface {v2, v4}, Landroid/view/Menu;->removeItem(I)V

    :cond_1
    :goto_0
    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/i72;->OXi001()Z

    move-result v1

    const v2, 0x7f0a0569

    if-eqz v1, :cond_2

    new-instance v1, Lcom/sma/smartv3/ui/ai/fragment/AI2Fragment;

    invoke-direct {v1}, Lcom/sma/smartv3/ui/ai/fragment/AI2Fragment;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/main/BaseMainActivity;->getBottomNav()Lcom/google/android/material/bottomnavigation/BottomNavigationView;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/material/navigation/NavigationBarView;->getMenu()Landroid/view/Menu;

    move-result-object v1

    invoke-interface {v1, v2}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-interface {v1, v3}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/main/BaseMainActivity;->getBottomNav()Lcom/google/android/material/bottomnavigation/BottomNavigationView;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/material/navigation/NavigationBarView;->getMenu()Landroid/view/Menu;

    move-result-object v1

    invoke-interface {v1, v2}, Landroid/view/Menu;->removeItem(I)V

    :cond_3
    :goto_1
    new-instance v1, Lcom/sma/smartv3/ui/device/Device2Fragment;

    invoke-direct {v1}, Lcom/sma/smartv3/ui/device/Device2Fragment;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Lcom/sma/smartv3/ui/me/Me2Fragment;

    invoke-direct {v1}, Lcom/sma/smartv3/ui/me/Me2Fragment;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public initView()V
    .locals 0

    invoke-super {p0}, Lcom/sma/smartv3/ui/main/BaseMainActivity;->initView()V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->transparentStatusBar()V

    return-void
.end method
