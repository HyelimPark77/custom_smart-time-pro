.class public final Lcom/sma/smartv3/ui/sport/CustomSportDistanceGoalActivity;
.super Lcom/sma/smartv3/ui/sport/BaseCustomSportGoalActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCustomSportDistanceGoalActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomSportDistanceGoalActivity.kt\ncom/sma/smartv3/ui/sport/CustomSportDistanceGoalActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,80:1\n19#2:81\n15#2:82\n*S KotlinDebug\n*F\n+ 1 CustomSportDistanceGoalActivity.kt\ncom/sma/smartv3/ui/sport/CustomSportDistanceGoalActivity\n*L\n27#1:81\n27#1:82\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nCustomSportDistanceGoalActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomSportDistanceGoalActivity.kt\ncom/sma/smartv3/ui/sport/CustomSportDistanceGoalActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,80:1\n19#2:81\n15#2:82\n*S KotlinDebug\n*F\n+ 1 CustomSportDistanceGoalActivity.kt\ncom/sma/smartv3/ui/sport/CustomSportDistanceGoalActivity\n*L\n27#1:81\n27#1:82\n*E\n"
    }
.end annotation


# instance fields
.field private final distance1Et$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final distance2Et$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final distance3Et$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvDistanceUtil$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final userProfile:Lcom/sma/smartv3/model/AppUser;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 32

    move-object/from16 v0, p0

    invoke-direct {v0}, Lcom/sma/smartv3/ui/sport/BaseCustomSportGoalActivity;-><init>()V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/iI1111I;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/iI1111I;-><init>(Lcom/sma/smartv3/ui/sport/CustomSportDistanceGoalActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/CustomSportDistanceGoalActivity;->distance1Et$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/iO0iiOX1X;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/iO0iiOX1X;-><init>(Lcom/sma/smartv3/ui/sport/CustomSportDistanceGoalActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/CustomSportDistanceGoalActivity;->distance2Et$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/XO0OI01;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/XO0OI01;-><init>(Lcom/sma/smartv3/ui/sport/CustomSportDistanceGoalActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/CustomSportDistanceGoalActivity;->distance3Et$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/XXO1XO0;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/XXO1XO0;-><init>(Lcom/sma/smartv3/ui/sport/CustomSportDistanceGoalActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/CustomSportDistanceGoalActivity;->tvDistanceUtil$delegate:Lkotlin/Lazy;

    sget-object v1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    new-instance v2, Lcom/sma/smartv3/model/AppUser;

    const v30, 0x7ffffff

    const/16 v31, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    invoke-direct/range {v2 .. v31}, Lcom/sma/smartv3/model/AppUser;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIFFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/smartv3/model/ThirdPlatform;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Lcom/google/gson/Gson;

    invoke-direct {v3}, Lcom/google/gson/Gson;-><init>()V

    const-class v4, Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1, v4}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    check-cast v2, Lcom/sma/smartv3/model/AppUser;

    iput-object v2, v0, Lcom/sma/smartv3/ui/sport/CustomSportDistanceGoalActivity;->userProfile:Lcom/sma/smartv3/model/AppUser;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/sport/CustomSportDistanceGoalActivity;)Landroid/widget/EditText;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/CustomSportDistanceGoalActivity;->distance1Et_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/CustomSportDistanceGoalActivity;)Landroid/widget/EditText;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/sport/CustomSportDistanceGoalActivity;)Landroid/widget/EditText;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/CustomSportDistanceGoalActivity;->distance3Et_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/CustomSportDistanceGoalActivity;)Landroid/widget/EditText;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/sport/CustomSportDistanceGoalActivity;)Landroid/widget/EditText;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/CustomSportDistanceGoalActivity;->distance2Et_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/CustomSportDistanceGoalActivity;)Landroid/widget/EditText;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/sport/CustomSportDistanceGoalActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/CustomSportDistanceGoalActivity;->tvDistanceUtil_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/CustomSportDistanceGoalActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method private static final distance1Et_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/CustomSportDistanceGoalActivity;)Landroid/widget/EditText;
    .locals 1

    const v0, 0x7f0a0319

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/EditText;

    return-object p0
.end method

.method private static final distance2Et_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/CustomSportDistanceGoalActivity;)Landroid/widget/EditText;
    .locals 1

    const v0, 0x7f0a031a

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/EditText;

    return-object p0
.end method

.method private static final distance3Et_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/CustomSportDistanceGoalActivity;)Landroid/widget/EditText;
    .locals 1

    const v0, 0x7f0a031b

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/EditText;

    return-object p0
.end method

.method private final getTvDistanceUtil()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/CustomSportDistanceGoalActivity;->tvDistanceUtil$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private static final tvDistanceUtil_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/CustomSportDistanceGoalActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a031f

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method


# virtual methods
.method public final getDistance1Et()Landroid/widget/EditText;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/CustomSportDistanceGoalActivity;->distance1Et$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    return-object v0
.end method

.method public final getDistance2Et()Landroid/widget/EditText;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/CustomSportDistanceGoalActivity;->distance2Et$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    return-object v0
.end method

.method public final getDistance3Et()Landroid/widget/EditText;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/CustomSportDistanceGoalActivity;->distance3Et$delegate:Lkotlin/Lazy;

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

    const v1, 0x7f0a0023

    invoke-virtual {p0, v1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const v2, 0x7f14038d

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/CustomSportDistanceGoalActivity;->getDistance1Et()Landroid/widget/EditText;

    move-result-object v7

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/CustomSportDistanceGoalActivity;->getDistance1Et()Landroid/widget/EditText;

    move-result-object v1

    const-string v8, "<get-distance1Et>(...)"

    invoke-static {v1, v8}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/CustomSportDistanceGoalActivity;->getDistance1Et()Landroid/widget/EditText;

    move-result-object v2

    invoke-static {v2, v8}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/CustomSportDistanceGoalActivity;->getDistance2Et()Landroid/widget/EditText;

    move-result-object v3

    const-string v9, "<get-distance2Et>(...)"

    invoke-static {v3, v9}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v5, 0x8

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v6}, Lcom/sma/smartv3/ui/sport/BaseCustomSportGoalActivity;->setKeyListener$default(Lcom/sma/smartv3/ui/sport/BaseCustomSportGoalActivity;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;ZILjava/lang/Object;)Landroid/view/View$OnKeyListener;

    move-result-object v1

    invoke-virtual {v7, v1}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/CustomSportDistanceGoalActivity;->getDistance2Et()Landroid/widget/EditText;

    move-result-object v7

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/CustomSportDistanceGoalActivity;->getDistance1Et()Landroid/widget/EditText;

    move-result-object v1

    invoke-static {v1, v8}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/CustomSportDistanceGoalActivity;->getDistance2Et()Landroid/widget/EditText;

    move-result-object v2

    invoke-static {v2, v9}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/CustomSportDistanceGoalActivity;->getDistance3Et()Landroid/widget/EditText;

    move-result-object v3

    const-string v8, "<get-distance3Et>(...)"

    invoke-static {v3, v8}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static/range {v0 .. v6}, Lcom/sma/smartv3/ui/sport/BaseCustomSportGoalActivity;->setKeyListener$default(Lcom/sma/smartv3/ui/sport/BaseCustomSportGoalActivity;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;ZILjava/lang/Object;)Landroid/view/View$OnKeyListener;

    move-result-object v1

    invoke-virtual {v7, v1}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/CustomSportDistanceGoalActivity;->getDistance3Et()Landroid/widget/EditText;

    move-result-object v7

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/CustomSportDistanceGoalActivity;->getDistance2Et()Landroid/widget/EditText;

    move-result-object v1

    invoke-static {v1, v9}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/CustomSportDistanceGoalActivity;->getDistance3Et()Landroid/widget/EditText;

    move-result-object v2

    invoke-static {v2, v8}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/CustomSportDistanceGoalActivity;->getDistance3Et()Landroid/widget/EditText;

    move-result-object v3

    invoke-static {v3, v8}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static/range {v0 .. v6}, Lcom/sma/smartv3/ui/sport/BaseCustomSportGoalActivity;->setKeyListener$default(Lcom/sma/smartv3/ui/sport/BaseCustomSportGoalActivity;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;ZILjava/lang/Object;)Landroid/view/View$OnKeyListener;

    move-result-object v1

    invoke-virtual {v7, v1}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/CustomSportDistanceGoalActivity;->getTvDistanceUtil()Landroid/widget/TextView;

    move-result-object v1

    iget-object v2, p0, Lcom/sma/smartv3/ui/sport/CustomSportDistanceGoalActivity;->userProfile:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v2

    invoke-static {v2}, Lcom/android/mltcode/paycertificationapi/cp5;->XX0(I)I

    move-result v2

    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0058

    return v0
.end method

.method public onTitleRightClick(Landroid/view/View;)V
    .locals 4
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/CustomSportDistanceGoalActivity;->getDistance1Et()Landroid/widget/EditText;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/CustomSportDistanceGoalActivity;->getDistance2Et()Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/CustomSportDistanceGoalActivity;->getDistance3Et()Landroid/widget/EditText;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    const-string v3, "0"

    if-nez v2, :cond_0

    move-object p1, v3

    :cond_0
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_1

    move-object v0, v3

    :cond_1
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_2

    move-object v1, v3

    :cond_2
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    mul-int/lit16 p1, p1, 0x2710

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    mul-int/lit16 v0, v0, 0x3e8

    add-int/2addr p1, v0

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    mul-int/lit8 v0, v0, 0x64

    add-int/2addr p1, v0

    int-to-float v0, p1

    const/high16 v1, 0x447a0000    # 1000.0f

    div-float v1, v0, v1

    const/4 v2, 0x1

    invoke-static {v1, v2}, Lcom/android/mltcode/paycertificationapi/cp5;->iX1O1(FZ)Ljava/lang/String;

    move-result-object v1

    iget-object v3, p0, Lcom/sma/smartv3/ui/sport/CustomSportDistanceGoalActivity;->userProfile:Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v3}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v3

    if-ne v3, v2, :cond_3

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/l76;->IiI10X(F)F

    move-result p1

    float-to-int p1, p1

    :cond_3
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

    new-instance v2, Lkotlin/Pair;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-direct {v2, v1, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string p1, "pair"

    invoke-virtual {v0, p1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    move-result-object p1

    const/4 v0, -0x1

    invoke-virtual {p0, v0, p1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method
