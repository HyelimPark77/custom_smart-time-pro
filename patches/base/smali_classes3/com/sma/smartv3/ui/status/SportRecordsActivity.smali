.class public final Lcom/sma/smartv3/ui/status/SportRecordsActivity;
.super Lcom/sma/smartv3/ui/status/base/StatusBaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/ui/status/SportRecordsActivity$OXO1;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/sma/smartv3/ui/status/SportRecordsActivity$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public static final TAG:Ljava/lang/String; = "SportRecordsActivity"
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# instance fields
.field private mSportRecordsFragment:Lcom/sma/smartv3/ui/status/fragment/SportRecordsFragment;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mSportRecordsV2Fragment:Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/sma/smartv3/ui/status/SportRecordsActivity$OXO1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/sma/smartv3/ui/status/SportRecordsActivity$OXO1;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/sma/smartv3/ui/status/SportRecordsActivity;->Companion:Lcom/sma/smartv3/ui/status/SportRecordsActivity$OXO1;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/base/StatusBaseActivity;-><init>()V

    return-void
.end method


# virtual methods
.method public final getMSportRecordsFragment()Lcom/sma/smartv3/ui/status/fragment/SportRecordsFragment;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsActivity;->mSportRecordsFragment:Lcom/sma/smartv3/ui/status/fragment/SportRecordsFragment;

    return-object v0
.end method

.method public final getMSportRecordsV2Fragment()Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsActivity;->mSportRecordsV2Fragment:Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;

    return-object v0
.end method

.method public initFragment()V
    .locals 0

    return-void
.end method

.method public initFragments()Ljava/util/List;
    .locals 4
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

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->iIXX0i()Z

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "SportRecordsActivity"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->iIXX0i()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsActivity;->mSportRecordsV2Fragment:Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result v0

    const/4 v1, -0x1

    if-le v0, v1, :cond_0

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "mArg1"

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/SportRecordsActivity;->mSportRecordsV2Fragment:Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v1, v0}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsActivity;->mSportRecordsV2Fragment:Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    new-instance v0, Lcom/sma/smartv3/ui/status/fragment/SportRecordsFragment;

    invoke-direct {v0}, Lcom/sma/smartv3/ui/status/fragment/SportRecordsFragment;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/SportRecordsActivity;->mSportRecordsFragment:Lcom/sma/smartv3/ui/status/fragment/SportRecordsFragment;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    :goto_0
    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/X0iO1XX;->I0iXXO(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public initView()V
    .locals 4

    invoke-super {p0}, Lcom/sma/smartv3/ui/status/base/StatusBaseActivity;->initView()V

    const v0, 0x7f0a0bcb

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/StatusBaseActivity;->getTable()Lcom/google/android/material/tabs/TabLayout;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/StatusBaseActivity;->getAbhTitleRight()Landroid/widget/ImageView;

    move-result-object v0

    sget-object v2, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/i72;->iIXX0i()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/base/StatusBaseActivity;->getAbhTitleRight()Landroid/widget/ImageView;

    move-result-object v1

    const v3, 0x7f08124f

    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    const/4 v1, 0x0

    :cond_0
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    const v0, 0x7f0a0022

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/i72;->IiiXiI0I()Z

    move-result v1

    if-eqz v1, :cond_1

    const v1, 0x7f0607b1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    :cond_1
    return-void
.end method

.method public onTitleRightClick(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/i72;->iIXX0i()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/SportRecordsActivity;->mSportRecordsV2Fragment:Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/status/base/BaseStatusFragment;->showCalendarPopop()V

    :cond_0
    return-void
.end method

.method public final setMSportRecordsFragment(Lcom/sma/smartv3/ui/status/fragment/SportRecordsFragment;)V
    .locals 0
    .param p1    # Lcom/sma/smartv3/ui/status/fragment/SportRecordsFragment;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/SportRecordsActivity;->mSportRecordsFragment:Lcom/sma/smartv3/ui/status/fragment/SportRecordsFragment;

    return-void
.end method

.method public final setMSportRecordsV2Fragment(Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;)V
    .locals 0
    .param p1    # Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/SportRecordsActivity;->mSportRecordsV2Fragment:Lcom/sma/smartv3/ui/status/fragment/SportRecordsV2Fragment;

    return-void
.end method

.method public setTitle()Ljava/lang/String;
    .locals 3
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result v0

    const/4 v1, -0x1

    const-string v2, "getString(...)"

    if-le v0, v1, :cond_0

    const v0, 0x7f140c38

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :cond_0
    const v0, 0x7f1412a7

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
