.class public final Lcom/sma/smartv3/ui/sport/SportGoalTimeFragment;
.super Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSportGoalTimeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportGoalTimeFragment.kt\ncom/sma/smartv3/ui/sport/SportGoalTimeFragment\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,92:1\n151#2,5:93\n156#2,5:99\n99#2,7:104\n106#2,3:112\n79#2,7:115\n109#2:122\n1#3:98\n1#3:111\n*S KotlinDebug\n*F\n+ 1 SportGoalTimeFragment.kt\ncom/sma/smartv3/ui/sport/SportGoalTimeFragment\n*L\n54#1:93,5\n54#1:99,5\n70#1:104,7\n70#1:112,3\n70#1:115,7\n70#1:122\n54#1:98\n70#1:111\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSportGoalTimeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportGoalTimeFragment.kt\ncom/sma/smartv3/ui/sport/SportGoalTimeFragment\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,92:1\n151#2,5:93\n156#2,5:99\n99#2,7:104\n106#2,3:112\n79#2,7:115\n109#2:122\n1#3:98\n1#3:111\n*S KotlinDebug\n*F\n+ 1 SportGoalTimeFragment.kt\ncom/sma/smartv3/ui/sport/SportGoalTimeFragment\n*L\n54#1:93,5\n54#1:99,5\n70#1:104,7\n70#1:112,3\n70#1:115,7\n70#1:122\n54#1:98\n70#1:111\n*E\n"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;-><init>()V

    return-void
.end method


# virtual methods
.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 2
    .param p3    # Landroid/content/Intent;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/Fragment;->onActivityResult(IILandroid/content/Intent;)V

    const/4 p1, -0x1

    if-ne p2, p1, :cond_1

    if-eqz p3, :cond_0

    const-string p1, "pair"

    invoke-virtual {p3, p1}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    const-string p2, "null cannot be cast to non-null type kotlin.Pair<kotlin.String, kotlin.Int>"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;->getNowGoalValue()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object p2

    invoke-virtual {p1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/CharSequence;

    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;->getStartExerciseBt()Landroid/widget/Button;

    move-result-object p2

    const/4 p3, 0x1

    invoke-virtual {p2, p3}, Landroid/view/View;->setEnabled(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;->getGoals()[I

    move-result-object p2

    const/4 v0, 0x0

    aput v0, p2, v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;->getGoals()[I

    move-result-object p2

    invoke-virtual {p1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    aput v1, p2, p3

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;->getGoals()[I

    move-result-object p2

    const/4 p3, 0x2

    aput v0, p2, p3

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "pair -> "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public setGoalValueItem()V
    .locals 6

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;->getDistanceItemData()Ljava/util/HashMap;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const v2, 0x7f140f4f

    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "15 "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;->getDistanceItemData()Ljava/util/HashMap;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "30 "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;->getDistanceItemData()Ljava/util/HashMap;

    move-result-object v0

    const/4 v1, 0x2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "40 "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;->getDistanceItemData()Ljava/util/HashMap;

    move-result-object v0

    const/4 v1, 0x3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "50 "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;->getDistanceItemData()Ljava/util/HashMap;

    move-result-object v0

    const/4 v1, 0x4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "60 "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;->getDistanceItemData()Ljava/util/HashMap;

    move-result-object v0

    const/4 v1, 0x5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "120 "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public setInfo()V
    .locals 2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;->getNowGoalUnit()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    const v1, 0x7f140c9a

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    return-void
.end method

.method public startExercise()V
    .locals 5

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMArg1()I

    move-result v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;->getGoals()[I

    move-result-object v1

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    const-string v3, "mArg0"

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "mArg1"

    invoke-virtual {v2, v3, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "mArg2"

    invoke-virtual {v2, v0, v4}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v0, "mArg3"

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v1

    const-class v3, Lcom/sma/smartv3/ui/sport/SportOnGoingGpsActivity;

    invoke-direct {v0, v1, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v2}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->startActivity(Landroid/content/Intent;)V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    :cond_0
    return-void
.end method

.method public toCustomerGoal()V
    .locals 3

    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    const-class v2, Lcom/sma/smartv3/ui/sport/CustomSportTimeGoalActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/16 v1, 0x7b

    invoke-virtual {p0, v0, v1}, Landroidx/fragment/app/Fragment;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method public updateGoalValue(I)V
    .locals 9

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;->getNowGoalValue()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v0

    const/4 v1, 0x5

    const/4 v2, 0x4

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz p1, :cond_5

    if-eq p1, v5, :cond_4

    if-eq p1, v4, :cond_3

    if-eq p1, v3, :cond_2

    if-eq p1, v2, :cond_1

    if-eq p1, v1, :cond_0

    const-string v6, "00:00"

    goto :goto_0

    :cond_0
    const-string v6, "02:00"

    goto :goto_0

    :cond_1
    const-string v6, "01:00"

    goto :goto_0

    :cond_2
    const-string v6, "00:50"

    goto :goto_0

    :cond_3
    const-string v6, "00:40"

    goto :goto_0

    :cond_4
    const-string v6, "00:30"

    goto :goto_0

    :cond_5
    const-string v6, "00:15"

    :goto_0
    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;->getStartExerciseBt()Landroid/widget/Button;

    move-result-object v0

    const/4 v6, 0x0

    if-eqz p1, :cond_6

    if-eq p1, v5, :cond_6

    if-eq p1, v4, :cond_6

    if-eq p1, v3, :cond_6

    if-eq p1, v2, :cond_6

    if-eq p1, v1, :cond_6

    move v7, v6

    goto :goto_1

    :cond_6
    move v7, v5

    :goto_1
    invoke-virtual {v0, v7}, Landroid/view/View;->setEnabled(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;->getGoals()[I

    move-result-object v0

    sget-object v7, Lcom/sma/smartv3/ui/sport/XO0O10;->OXO1:Lcom/sma/smartv3/ui/sport/XO0O10;

    invoke-virtual {v7}, Lcom/sma/smartv3/ui/sport/XO0O10;->iX()I

    move-result v8

    aput v6, v0, v8

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;->getGoals()[I

    move-result-object v0

    invoke-virtual {v7}, Lcom/sma/smartv3/ui/sport/XO0O10;->IXXOO()I

    move-result v8

    if-eqz p1, :cond_c

    if-eq p1, v5, :cond_b

    if-eq p1, v4, :cond_a

    if-eq p1, v3, :cond_9

    if-eq p1, v2, :cond_8

    if-eq p1, v1, :cond_7

    move p1, v6

    goto :goto_2

    :cond_7
    const/16 p1, 0x1c20

    goto :goto_2

    :cond_8
    const/16 p1, 0xe10

    goto :goto_2

    :cond_9
    const/16 p1, 0xbb8

    goto :goto_2

    :cond_a
    const/16 p1, 0x960

    goto :goto_2

    :cond_b
    const/16 p1, 0x708

    goto :goto_2

    :cond_c
    const/16 p1, 0x384

    :goto_2
    aput p1, v0, v8

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseSportGoalSetFragment;->getGoals()[I

    move-result-object p1

    invoke-virtual {v7}, Lcom/sma/smartv3/ui/sport/XO0O10;->i010I()I

    move-result v0

    aput v6, p1, v0

    return-void
.end method
