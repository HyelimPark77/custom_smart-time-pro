.class public final Lcom/sma/smartv3/ui/ai/fragment/AI2Fragment;
.super Lcom/sma/smartv3/ui/ai/fragment/AIFragment;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/iiO11XiX;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/ai/fragment/AIFragment;-><init>()V

    return-void
.end method


# virtual methods
.method public initView()V
    .locals 2

    invoke-super {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->initView()V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMView()Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0a09c1

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/BarUtils;->addMarginTopEqualStatusBarHeight(Landroid/view/View;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d108f

    return v0
.end method

.method public onFragmentVisibilityChanged(Z)V
    .locals 2

    const/4 p1, 0x0

    const/4 v0, 0x2

    const-string v1, "AD_STATE_CHANGE_AI"

    invoke-static {v1, p1, v0, p1}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method
