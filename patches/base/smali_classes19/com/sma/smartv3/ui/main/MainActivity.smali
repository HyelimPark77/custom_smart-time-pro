.class public final Lcom/sma/smartv3/ui/main/MainActivity;
.super Lcom/sma/smartv3/ui/main/BaseMain2Activity;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/main/BaseMain2Activity;-><init>()V

    return-void
.end method


# virtual methods
.method public viewPagerSelected(I)V
    .locals 2

    invoke-super {p0, p1}, Lcom/sma/smartv3/ui/main/BaseMainActivity;->viewPagerSelected(I)V

    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->getFragments()Ljava/util/List;

    move-result-object v0

    const-string v1, "getFragments(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/fragment/app/Fragment;

    instance-of v0, p1, Lcom/sma/smartv3/ui/ai/fragment/AI2Fragment;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    check-cast p1, Lcom/sma/smartv3/ui/ai/fragment/AI2Fragment;

    invoke-virtual {p1, v1}, Lcom/sma/smartv3/ui/ai/fragment/AI2Fragment;->onFragmentVisibilityChanged(Z)V

    return-void

    :cond_0
    instance-of v0, p1, Lcom/sma/smartv3/ui/me/Me2Fragment;

    if-eqz v0, :cond_1

    check-cast p1, Lcom/sma/smartv3/ui/me/Me2Fragment;

    invoke-virtual {p1, v1}, Lcom/sma/smartv3/ui/me/Me2Fragment;->onFragmentVisibilityChanged(Z)V

    :cond_1
    return-void
.end method
