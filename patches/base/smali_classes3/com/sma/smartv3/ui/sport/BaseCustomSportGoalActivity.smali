.class public abstract Lcom/sma/smartv3/ui/sport/BaseCustomSportGoalActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# instance fields
.field private final abh_title_right$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OX0010Xi;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/OX0010Xi;-><init>(Lcom/sma/smartv3/ui/sport/BaseCustomSportGoalActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseCustomSportGoalActivity;->abh_title_right$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/sport/BaseCustomSportGoalActivity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/BaseCustomSportGoalActivity;->abh_title_right_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseCustomSportGoalActivity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method private static final abh_title_right_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/BaseCustomSportGoalActivity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a0026

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method public static synthetic setKeyListener$default(Lcom/sma/smartv3/ui/sport/BaseCustomSportGoalActivity;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;ZILjava/lang/Object;)Landroid/view/View$OnKeyListener;
    .locals 0

    if-nez p6, :cond_1

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    const/4 p4, 0x1

    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/sma/smartv3/ui/sport/BaseCustomSportGoalActivity;->setKeyListener(Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;Z)Landroid/view/View$OnKeyListener;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: setKeyListener"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final getAbh_title_right()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/BaseCustomSportGoalActivity;->abh_title_right$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method public initView()V
    .locals 2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseCustomSportGoalActivity;->getAbh_title_right()Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/BaseCustomSportGoalActivity;->getAbh_title_right()Landroid/widget/ImageView;

    move-result-object v0

    const v1, 0x7f081689

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    return-void
.end method

.method public final onTitleLeftClick(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

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

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    const-string v0, "onTitleRightClick"

    invoke-static {v0, p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public final setKeyListener(Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;Z)Landroid/view/View$OnKeyListener;
    .locals 1
    .param p1    # Landroid/widget/EditText;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Landroid/widget/EditText;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Landroid/widget/EditText;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "leftEdit"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "middleEdit"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rightEdit"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/sma/smartv3/ui/sport/BaseCustomSportGoalActivity$OXO1;

    invoke-direct {v0, p4, p3}, Lcom/sma/smartv3/ui/sport/BaseCustomSportGoalActivity$OXO1;-><init>(ZLandroid/widget/EditText;)V

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    new-instance p4, Lcom/sma/smartv3/ui/sport/BaseCustomSportGoalActivity$XIi00iiXO;

    invoke-direct {p4, p2, p1, p3}, Lcom/sma/smartv3/ui/sport/BaseCustomSportGoalActivity$XIi00iiXO;-><init>(Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;)V

    return-object p4
.end method
