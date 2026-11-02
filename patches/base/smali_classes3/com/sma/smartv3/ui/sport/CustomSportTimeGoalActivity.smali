.class public final Lcom/sma/smartv3/ui/sport/CustomSportTimeGoalActivity;
.super Lcom/sma/smartv3/ui/sport/BaseCustomSportGoalActivity;
.source "SourceFile"


# instance fields
.field private final time1Et$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final time2Et$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final time3Et$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final time4Et$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/BaseCustomSportGoalActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IO0XOX;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/IO0XOX;-><init>(Lcom/sma/smartv3/ui/sport/CustomSportTimeGoalActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/CustomSportTimeGoalActivity;->time1Et$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/Oi10iOX;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/Oi10iOX;-><init>(Lcom/sma/smartv3/ui/sport/CustomSportTimeGoalActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/CustomSportTimeGoalActivity;->time2Et$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OIX10;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/OIX10;-><init>(Lcom/sma/smartv3/ui/sport/CustomSportTimeGoalActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/CustomSportTimeGoalActivity;->time3Et$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XOXOXI;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/XOXOXI;-><init>(Lcom/sma/smartv3/ui/sport/CustomSportTimeGoalActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/CustomSportTimeGoalActivity;->time4Et$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/sport/CustomSportTimeGoalActivity;)Landroid/widget/EditText;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/CustomSportTimeGoalActivity;->time3Et_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/CustomSportTimeGoalActivity;)Landroid/widget/EditText;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/sport/CustomSportTimeGoalActivity;)Landroid/widget/EditText;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/CustomSportTimeGoalActivity;->time2Et_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/CustomSportTimeGoalActivity;)Landroid/widget/EditText;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/sport/CustomSportTimeGoalActivity;)Landroid/widget/EditText;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/CustomSportTimeGoalActivity;->time1Et_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/CustomSportTimeGoalActivity;)Landroid/widget/EditText;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/sport/CustomSportTimeGoalActivity;)Landroid/widget/EditText;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/CustomSportTimeGoalActivity;->time4Et_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/CustomSportTimeGoalActivity;)Landroid/widget/EditText;

    move-result-object p0

    return-object p0
.end method

.method private static final time1Et_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/CustomSportTimeGoalActivity;)Landroid/widget/EditText;
    .locals 1

    const v0, 0x7f0a0bac

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/EditText;

    return-object p0
.end method

.method private static final time2Et_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/CustomSportTimeGoalActivity;)Landroid/widget/EditText;
    .locals 1

    const v0, 0x7f0a0bad

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/EditText;

    return-object p0
.end method

.method private static final time3Et_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/CustomSportTimeGoalActivity;)Landroid/widget/EditText;
    .locals 1

    const v0, 0x7f0a0bae

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/EditText;

    return-object p0
.end method

.method private static final time4Et_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/CustomSportTimeGoalActivity;)Landroid/widget/EditText;
    .locals 1

    const v0, 0x7f0a0baf

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/EditText;

    return-object p0
.end method


# virtual methods
.method public final getTime1Et()Landroid/widget/EditText;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/CustomSportTimeGoalActivity;->time1Et$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    return-object v0
.end method

.method public final getTime2Et()Landroid/widget/EditText;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/CustomSportTimeGoalActivity;->time2Et$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    return-object v0
.end method

.method public final getTime3Et()Landroid/widget/EditText;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/CustomSportTimeGoalActivity;->time3Et$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    return-object v0
.end method

.method public final getTime4Et()Landroid/widget/EditText;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/CustomSportTimeGoalActivity;->time4Et$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    return-object v0
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    return-void
.end method

.method public initView()V
    .locals 10

    invoke-super {p0}, Lcom/sma/smartv3/ui/sport/BaseCustomSportGoalActivity;->initView()V

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v2, 0x7f14038e

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/CustomSportTimeGoalActivity;->getTime1Et()Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/CustomSportTimeGoalActivity;->getTime1Et()Landroid/widget/EditText;

    move-result-object v2

    const-string v8, "<get-time1Et>(...)"

    invoke-static {v2, v8}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/CustomSportTimeGoalActivity;->getTime1Et()Landroid/widget/EditText;

    move-result-object v3

    invoke-static {v3, v8}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/CustomSportTimeGoalActivity;->getTime2Et()Landroid/widget/EditText;

    move-result-object v4

    const-string v9, "<get-time2Et>(...)"

    invoke-static {v4, v9}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v7}, Lcom/sma/smartv3/ui/sport/BaseCustomSportGoalActivity;->setKeyListener$default(Lcom/sma/smartv3/ui/sport/BaseCustomSportGoalActivity;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;ZILjava/lang/Object;)Landroid/view/View$OnKeyListener;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/CustomSportTimeGoalActivity;->getTime2Et()Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/CustomSportTimeGoalActivity;->getTime1Et()Landroid/widget/EditText;

    move-result-object v2

    invoke-static {v2, v8}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/CustomSportTimeGoalActivity;->getTime2Et()Landroid/widget/EditText;

    move-result-object v3

    invoke-static {v3, v9}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/CustomSportTimeGoalActivity;->getTime3Et()Landroid/widget/EditText;

    move-result-object v4

    const-string v8, "<get-time3Et>(...)"

    invoke-static {v4, v8}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static/range {v1 .. v7}, Lcom/sma/smartv3/ui/sport/BaseCustomSportGoalActivity;->setKeyListener$default(Lcom/sma/smartv3/ui/sport/BaseCustomSportGoalActivity;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;ZILjava/lang/Object;)Landroid/view/View$OnKeyListener;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/CustomSportTimeGoalActivity;->getTime3Et()Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/CustomSportTimeGoalActivity;->getTime2Et()Landroid/widget/EditText;

    move-result-object v2

    invoke-static {v2, v9}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/CustomSportTimeGoalActivity;->getTime3Et()Landroid/widget/EditText;

    move-result-object v3

    invoke-static {v3, v8}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/CustomSportTimeGoalActivity;->getTime4Et()Landroid/widget/EditText;

    move-result-object v4

    const-string v9, "<get-time4Et>(...)"

    invoke-static {v4, v9}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static/range {v1 .. v7}, Lcom/sma/smartv3/ui/sport/BaseCustomSportGoalActivity;->setKeyListener$default(Lcom/sma/smartv3/ui/sport/BaseCustomSportGoalActivity;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;ZILjava/lang/Object;)Landroid/view/View$OnKeyListener;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/CustomSportTimeGoalActivity;->getTime4Et()Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/CustomSportTimeGoalActivity;->getTime3Et()Landroid/widget/EditText;

    move-result-object v2

    invoke-static {v2, v8}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/CustomSportTimeGoalActivity;->getTime4Et()Landroid/widget/EditText;

    move-result-object v3

    invoke-static {v3, v9}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/CustomSportTimeGoalActivity;->getTime4Et()Landroid/widget/EditText;

    move-result-object v4

    invoke-static {v4, v9}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static/range {v1 .. v7}, Lcom/sma/smartv3/ui/sport/BaseCustomSportGoalActivity;->setKeyListener$default(Lcom/sma/smartv3/ui/sport/BaseCustomSportGoalActivity;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;ZILjava/lang/Object;)Landroid/view/View$OnKeyListener;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0059

    return v0
.end method

.method public onTitleRightClick(Landroid/view/View;)V
    .locals 5
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/CustomSportTimeGoalActivity;->getTime1Et()Landroid/widget/EditText;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/CustomSportTimeGoalActivity;->getTime2Et()Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/CustomSportTimeGoalActivity;->getTime3Et()Landroid/widget/EditText;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/CustomSportTimeGoalActivity;->getTime4Et()Landroid/widget/EditText;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v3

    const-string v4, "0"

    if-nez v3, :cond_0

    move-object p1, v4

    :cond_0
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-nez v3, :cond_1

    move-object v0, v4

    :cond_1
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-nez v3, :cond_2

    move-object v1, v4

    :cond_2
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-nez v3, :cond_3

    move-object v2, v4

    :cond_3
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ":"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    const v4, 0x8ca0

    mul-int/2addr p1, v4

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    mul-int/lit16 v0, v0, 0xe10

    add-int/2addr p1, v0

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    mul-int/lit16 v0, v0, 0x258

    add-int/2addr p1, v0

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    mul-int/lit8 v0, v0, 0x3c

    add-int/2addr p1, v0

    if-nez p1, :cond_4

    const p1, 0x7f140ffa

    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_4
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    new-instance v1, Lkotlin/Pair;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-direct {v1, v3, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string p1, "pair"

    invoke-virtual {v0, p1, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    move-result-object p1

    const/4 v0, -0x1

    invoke-virtual {p0, v0, p1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method
