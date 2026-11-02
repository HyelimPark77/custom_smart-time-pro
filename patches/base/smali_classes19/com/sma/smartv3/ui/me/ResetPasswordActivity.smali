.class public final Lcom/sma/smartv3/ui/me/ResetPasswordActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nResetPasswordActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResetPasswordActivity.kt\ncom/sma/smartv3/ui/me/ResetPasswordActivity\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,164:1\n183#2,4:165\n196#2:177\n252#3,7:169\n270#3:176\n255#4:178\n*S KotlinDebug\n*F\n+ 1 ResetPasswordActivity.kt\ncom/sma/smartv3/ui/me/ResetPasswordActivity\n*L\n135#1:165,4\n135#1:177\n135#1:169,7\n135#1:176\n157#1:178\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nResetPasswordActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResetPasswordActivity.kt\ncom/sma/smartv3/ui/me/ResetPasswordActivity\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,164:1\n183#2,4:165\n196#2:177\n252#3,7:169\n270#3:176\n255#4:178\n*S KotlinDebug\n*F\n+ 1 ResetPasswordActivity.kt\ncom/sma/smartv3/ui/me/ResetPasswordActivity\n*L\n135#1:165,4\n135#1:177\n135#1:169,7\n135#1:176\n157#1:178\n*E\n"
    }
.end annotation


# instance fields
.field private final btGetVerificationCode$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final btnConfirm$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final btnNextStep$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final email$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final llGetVerificationCode$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final llSetNewPassword$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final newPassword$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final newPasswordAgain$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final resetPasswordTip$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final rv$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final verificationCode$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/zk3;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/zk3;-><init>(Lcom/sma/smartv3/ui/me/ResetPasswordActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/ResetPasswordActivity;->llGetVerificationCode$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/bl3;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/bl3;-><init>(Lcom/sma/smartv3/ui/me/ResetPasswordActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/ResetPasswordActivity;->llSetNewPassword$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/cl3;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/cl3;-><init>(Lcom/sma/smartv3/ui/me/ResetPasswordActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/ResetPasswordActivity;->email$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/dl3;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/dl3;-><init>(Lcom/sma/smartv3/ui/me/ResetPasswordActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/ResetPasswordActivity;->verificationCode$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/el3;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/el3;-><init>(Lcom/sma/smartv3/ui/me/ResetPasswordActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/ResetPasswordActivity;->newPassword$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/fl3;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/fl3;-><init>(Lcom/sma/smartv3/ui/me/ResetPasswordActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/ResetPasswordActivity;->newPasswordAgain$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/gl3;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/gl3;-><init>(Lcom/sma/smartv3/ui/me/ResetPasswordActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/ResetPasswordActivity;->btGetVerificationCode$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/vk3;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/vk3;-><init>(Lcom/sma/smartv3/ui/me/ResetPasswordActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/ResetPasswordActivity;->rv$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/wk3;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/wk3;-><init>(Lcom/sma/smartv3/ui/me/ResetPasswordActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/ResetPasswordActivity;->resetPasswordTip$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/xk3;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/xk3;-><init>(Lcom/sma/smartv3/ui/me/ResetPasswordActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/ResetPasswordActivity;->btnNextStep$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/al3;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/al3;-><init>(Lcom/sma/smartv3/ui/me/ResetPasswordActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/ResetPasswordActivity;->btnConfirm$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/me/ResetPasswordActivity;Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/me/ResetPasswordActivity;->initView$lambda$1(Lcom/sma/smartv3/ui/me/ResetPasswordActivity;Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z

    move-result p0

    return p0
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/me/ResetPasswordActivity;)Lcom/google/android/material/textfield/TextInputEditText;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/ResetPasswordActivity;->verificationCode_delegate$lambda$0(Lcom/sma/smartv3/ui/me/ResetPasswordActivity;)Lcom/google/android/material/textfield/TextInputEditText;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/ui/me/ResetPasswordActivity;Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/me/ResetPasswordActivity;->initView$lambda$2(Lcom/sma/smartv3/ui/me/ResetPasswordActivity;Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z

    move-result p0

    return p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/me/ResetPasswordActivity;)Landroid/widget/LinearLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/ResetPasswordActivity;->llGetVerificationCode_delegate$lambda$0(Lcom/sma/smartv3/ui/me/ResetPasswordActivity;)Landroid/widget/LinearLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/me/ResetPasswordActivity;)Lcom/google/android/material/textfield/TextInputEditText;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/ResetPasswordActivity;->email_delegate$lambda$0(Lcom/sma/smartv3/ui/me/ResetPasswordActivity;)Lcom/google/android/material/textfield/TextInputEditText;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OiIIX101O(Lcom/sma/smartv3/ui/me/ResetPasswordActivity;)Landroid/widget/LinearLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/ResetPasswordActivity;->llSetNewPassword_delegate$lambda$0(Lcom/sma/smartv3/ui/me/ResetPasswordActivity;)Landroid/widget/LinearLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/me/ResetPasswordActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/ResetPasswordActivity;->btnConfirm_delegate$lambda$0(Lcom/sma/smartv3/ui/me/ResetPasswordActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/me/ResetPasswordActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/ResetPasswordActivity;->resetPasswordTip_delegate$lambda$0(Lcom/sma/smartv3/ui/me/ResetPasswordActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XX0(Lcom/sma/smartv3/ui/me/ResetPasswordActivity;)Lcom/google/android/material/textfield/TextInputEditText;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/ResetPasswordActivity;->newPasswordAgain_delegate$lambda$0(Lcom/sma/smartv3/ui/me/ResetPasswordActivity;)Lcom/google/android/material/textfield/TextInputEditText;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/me/ResetPasswordActivity;)Lcom/google/android/material/textfield/TextInputEditText;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/ResetPasswordActivity;->newPassword_delegate$lambda$0(Lcom/sma/smartv3/ui/me/ResetPasswordActivity;)Lcom/google/android/material/textfield/TextInputEditText;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIO(Lcom/sma/smartv3/ui/me/ResetPasswordActivity;)Landroid/widget/LinearLayout;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/ResetPasswordActivity;->rv_delegate$lambda$0(Lcom/sma/smartv3/ui/me/ResetPasswordActivity;)Landroid/widget/LinearLayout;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XiOIii1(Lcom/sma/smartv3/ui/me/ResetPasswordActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/ResetPasswordActivity;->btnNextStep_delegate$lambda$0(Lcom/sma/smartv3/ui/me/ResetPasswordActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getBtnConfirm(Lcom/sma/smartv3/ui/me/ResetPasswordActivity;)Landroid/view/View;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/ResetPasswordActivity;->getBtnConfirm()Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getBtnNextStep(Lcom/sma/smartv3/ui/me/ResetPasswordActivity;)Landroid/view/View;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/ResetPasswordActivity;->getBtnNextStep()Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final btGetVerificationCode_delegate$lambda$0(Lcom/sma/smartv3/ui/me/ResetPasswordActivity;)Landroid/widget/Button;
    .locals 1

    const v0, 0x7f0a017f

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/Button;

    return-object p0
.end method

.method private static final btnConfirm_delegate$lambda$0(Lcom/sma/smartv3/ui/me/ResetPasswordActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a01c7

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final btnNextStep_delegate$lambda$0(Lcom/sma/smartv3/ui/me/ResetPasswordActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a01da

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private static final email_delegate$lambda$0(Lcom/sma/smartv3/ui/me/ResetPasswordActivity;)Lcom/google/android/material/textfield/TextInputEditText;
    .locals 1

    const v0, 0x7f0a0358

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/google/android/material/textfield/TextInputEditText;

    return-object p0
.end method

.method private final getBtGetVerificationCode()Landroid/widget/Button;
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/ResetPasswordActivity;->btGetVerificationCode$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "getValue(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/Button;

    return-object v0
.end method

.method private final getBtnConfirm()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/ResetPasswordActivity;->btnConfirm$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getBtnNextStep()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/ResetPasswordActivity;->btnNextStep$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getEmail()Lcom/google/android/material/textfield/TextInputEditText;
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/ResetPasswordActivity;->email$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "getValue(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/google/android/material/textfield/TextInputEditText;

    return-object v0
.end method

.method private final getLlGetVerificationCode()Landroid/widget/LinearLayout;
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/ResetPasswordActivity;->llGetVerificationCode$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "getValue(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private final getLlSetNewPassword()Landroid/widget/LinearLayout;
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/ResetPasswordActivity;->llSetNewPassword$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "getValue(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private final getNewPassword()Lcom/google/android/material/textfield/TextInputEditText;
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/ResetPasswordActivity;->newPassword$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "getValue(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/google/android/material/textfield/TextInputEditText;

    return-object v0
.end method

.method private final getNewPasswordAgain()Lcom/google/android/material/textfield/TextInputEditText;
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/ResetPasswordActivity;->newPasswordAgain$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "getValue(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/google/android/material/textfield/TextInputEditText;

    return-object v0
.end method

.method private final getResetPasswordTip()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/ResetPasswordActivity;->resetPasswordTip$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getRv()Landroid/widget/LinearLayout;
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/ResetPasswordActivity;->rv$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "getValue(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private final getVerificationCode()Lcom/google/android/material/textfield/TextInputEditText;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/sma/smartv3/ui/me/ResetPasswordActivity;->verificationCode$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "getValue(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/google/android/material/textfield/TextInputEditText;

    return-object v0
.end method

.method public static synthetic iIiiO(Lcom/sma/smartv3/ui/me/ResetPasswordActivity;)Landroid/widget/Button;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/ResetPasswordActivity;->btGetVerificationCode_delegate$lambda$0(Lcom/sma/smartv3/ui/me/ResetPasswordActivity;)Landroid/widget/Button;

    move-result-object p0

    return-object p0
.end method

.method private static final initView$lambda$1(Lcom/sma/smartv3/ui/me/ResetPasswordActivity;Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 0

    const/4 p1, 0x6

    if-ne p2, p1, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/ResetPasswordActivity;->getRv()Landroid/widget/LinearLayout;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/me/ResetPasswordActivity;->nextStep(Landroid/view/View;)V

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private static final initView$lambda$2(Lcom/sma/smartv3/ui/me/ResetPasswordActivity;Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 0

    const/4 p1, 0x6

    if-ne p2, p1, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/ResetPasswordActivity;->getRv()Landroid/widget/LinearLayout;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/me/ResetPasswordActivity;->confirm(Landroid/view/View;)V

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private static final llGetVerificationCode_delegate$lambda$0(Lcom/sma/smartv3/ui/me/ResetPasswordActivity;)Landroid/widget/LinearLayout;
    .locals 1

    const v0, 0x7f0a06bb

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/LinearLayout;

    return-object p0
.end method

.method private static final llSetNewPassword_delegate$lambda$0(Lcom/sma/smartv3/ui/me/ResetPasswordActivity;)Landroid/widget/LinearLayout;
    .locals 1

    const v0, 0x7f0a06c3

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/LinearLayout;

    return-object p0
.end method

.method private static final newPasswordAgain_delegate$lambda$0(Lcom/sma/smartv3/ui/me/ResetPasswordActivity;)Lcom/google/android/material/textfield/TextInputEditText;
    .locals 1

    const v0, 0x7f0a0890

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/google/android/material/textfield/TextInputEditText;

    return-object p0
.end method

.method private static final newPassword_delegate$lambda$0(Lcom/sma/smartv3/ui/me/ResetPasswordActivity;)Lcom/google/android/material/textfield/TextInputEditText;
    .locals 1

    const v0, 0x7f0a088f

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/google/android/material/textfield/TextInputEditText;

    return-object p0
.end method

.method private static final resetPasswordTip_delegate$lambda$0(Lcom/sma/smartv3/ui/me/ResetPasswordActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a099b

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final rv_delegate$lambda$0(Lcom/sma/smartv3/ui/me/ResetPasswordActivity;)Landroid/widget/LinearLayout;
    .locals 1

    const v0, 0x7f0a09c1

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/LinearLayout;

    return-object p0
.end method

.method private static final verificationCode_delegate$lambda$0(Lcom/sma/smartv3/ui/me/ResetPasswordActivity;)Lcom/google/android/material/textfield/TextInputEditText;
    .locals 1

    const v0, 0x7f0a18ea

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/google/android/material/textfield/TextInputEditText;

    return-object p0
.end method


# virtual methods
.method public final backClick(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/ResetPasswordActivity;->getLlSetNewPassword()Landroid/widget/LinearLayout;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result p1

    if-nez p1, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/ResetPasswordActivity;->getLlSetNewPassword()Landroid/widget/LinearLayout;

    move-result-object p1

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/ResetPasswordActivity;->getLlGetVerificationCode()Landroid/widget/LinearLayout;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public final confirm(Landroid/view/View;)V
    .locals 6
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/ResetPasswordActivity;->getNewPassword()Lcom/google/android/material/textfield/TextInputEditText;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-nez p1, :cond_0

    const p1, 0x7f140d1d

    invoke-static {p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    return-void

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/ResetPasswordActivity;->getNewPasswordAgain()Lcom/google/android/material/textfield/TextInputEditText;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-nez p1, :cond_1

    const p1, 0x7f140d1e

    invoke-static {p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    return-void

    :cond_1
    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/ResetPasswordActivity;->getNewPassword()Lcom/google/android/material/textfield/TextInputEditText;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    const/4 v0, 0x6

    if-lt p1, v0, :cond_4

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/ResetPasswordActivity;->getNewPassword()Lcom/google/android/material/textfield/TextInputEditText;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    const/16 v0, 0x20

    if-le p1, v0, :cond_2

    goto/16 :goto_0

    :cond_2
    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/ResetPasswordActivity;->getNewPassword()Lcom/google/android/material/textfield/TextInputEditText;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/ResetPasswordActivity;->getNewPasswordAgain()Lcom/google/android/material/textfield/TextInputEditText;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    const p1, 0x7f140d13

    invoke-static {p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    return-void

    :cond_3
    sget-object p1, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/ResetPasswordActivity;->getEmail()Lcom/google/android/material/textfield/TextInputEditText;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/ResetPasswordActivity;->getNewPassword()Lcom/google/android/material/textfield/TextInputEditText;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/ResetPasswordActivity;->getVerificationCode()Lcom/google/android/material/textfield/TextInputEditText;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/sma/smartv3/network/RequestBodyKt;->getResetPasswordBody(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/HashMap;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/ui/me/ResetPasswordActivity$confirm$1;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/me/ResetPasswordActivity$confirm$1;-><init>(Lcom/sma/smartv3/ui/me/ResetPasswordActivity;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/ResetPasswordActivity;->getRv()Landroid/widget/LinearLayout;

    move-result-object v2

    invoke-virtual {p1, p0, v2}, Lcom/sma/smartv3/network/NetWorkUtils;->loadPopup(Landroid/app/Activity;Landroid/view/View;)Lcom/android/mltcode/paycertificationapi/uq;

    move-result-object v2

    sget-object v3, Lcom/sma/smartv3/network/Api;->INSTANCE:Lcom/sma/smartv3/network/Api;

    invoke-virtual {v3}, Lcom/sma/smartv3/network/Api;->getBASE_URL()Ljava/lang/String;

    move-result-object v3

    const-string v4, "/appuser/reset_password"

    invoke-virtual {p1, v3, v4}, Lcom/sma/smartv3/network/NetWorkUtils;->convertBaseUrl(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1, v5, v0}, Lcom/sma/smartv3/network/NetWorkUtils;->printParam(Ljava/lang/String;Ljava/util/Map;)V

    sget-object p1, Lcom/sma/androidnetworklib/method/NetWork;->OXO1:Lcom/sma/androidnetworklib/method/NetWork;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v3, Lcom/sma/smartv3/ui/me/ResetPasswordActivity$confirm$$inlined$post$1;

    invoke-direct {v3, p0, v1, v2}, Lcom/sma/smartv3/ui/me/ResetPasswordActivity$confirm$$inlined$post$1;-><init>(Landroid/app/Activity;Lcom/android/mltcode/paycertificationapi/O1XIiIO;Lcom/android/mltcode/paycertificationapi/uq;)V

    invoke-static {p1}, Lcom/androidnetworking/AndroidNetworking;->post(Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->addBodyParameter(Ljava/util/Map;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setTag(Ljava/lang/Object;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    sget-object v0, Lcom/androidnetworking/common/Priority;->HIGH:Lcom/androidnetworking/common/Priority;

    invoke-virtual {p1, v0}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setPriority(Lcom/androidnetworking/common/Priority;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->build()Lcom/androidnetworking/common/ANRequest;

    move-result-object p1

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/reflect/Type;

    const-class v1, Ljava/lang/String;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-class v1, Lcom/sma/androidnetworklib/model/Response;

    invoke-static {v1, v0}, Lcom/google/gson/reflect/TypeToken;->getParameterized(Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/ui/me/ResetPasswordActivity$confirm$$inlined$post$2;

    invoke-direct {v1, v3}, Lcom/sma/smartv3/ui/me/ResetPasswordActivity$confirm$$inlined$post$2;-><init>(Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    invoke-virtual {p1, v0, v1}, Lcom/androidnetworking/common/ANRequest;->getAsParsed(Lcom/google/gson/reflect/TypeToken;Lcom/androidnetworking/interfaces/ParsedRequestListener;)V

    return-void

    :cond_4
    :goto_0
    const p1, 0x7f140e0a

    invoke-static {p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    return-void
.end method

.method public final getVerificationCode(Landroid/view/View;)V
    .locals 10
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    sget-object v1, Lcom/sma/smartv3/network/RequestCommonMethod;->INSTANCE:Lcom/sma/smartv3/network/RequestCommonMethod;

    .line 3
    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/ResetPasswordActivity;->getRv()Landroid/widget/LinearLayout;

    move-result-object v3

    .line 4
    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/ResetPasswordActivity;->getEmail()Lcom/google/android/material/textfield/TextInputEditText;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 5
    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/ResetPasswordActivity;->getBtGetVerificationCode()Landroid/widget/Button;

    move-result-object v5

    const/16 v8, 0x30

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v2, p0

    .line 6
    invoke-static/range {v1 .. v9}, Lcom/sma/smartv3/network/RequestCommonMethod;->requestVerificationCode$default(Lcom/sma/smartv3/network/RequestCommonMethod;Landroid/app/Activity;Landroid/view/View;Ljava/lang/String;Landroid/widget/TextView;ILcom/android/mltcode/paycertificationapi/O1XIiIO;ILjava/lang/Object;)V

    return-void
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
    .locals 4

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/ResetPasswordActivity;->getLlGetVerificationCode()Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/ResetPasswordActivity;->getLlSetNewPassword()Landroid/widget/LinearLayout;

    move-result-object v0

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/ResetPasswordActivity;->getResetPasswordTip()Landroid/widget/TextView;

    move-result-object v0

    sget-object v3, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/i72;->iIi1()Z

    move-result v3

    if-eqz v3, :cond_0

    move v2, v1

    :cond_0
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/ResetPasswordActivity;->getVerificationCode()Lcom/google/android/material/textfield/TextInputEditText;

    move-result-object v0

    new-instance v2, Lcom/android/mltcode/paycertificationapi/uk3;

    invoke-direct {v2, p0}, Lcom/android/mltcode/paycertificationapi/uk3;-><init>(Lcom/sma/smartv3/ui/me/ResetPasswordActivity;)V

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/ResetPasswordActivity;->getBtnNextStep()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/ResetPasswordActivity;->getVerificationCode()Lcom/google/android/material/textfield/TextInputEditText;

    move-result-object v0

    new-instance v2, Lcom/sma/smartv3/ui/me/ResetPasswordActivity$OXO1;

    invoke-direct {v2, p0}, Lcom/sma/smartv3/ui/me/ResetPasswordActivity$OXO1;-><init>(Lcom/sma/smartv3/ui/me/ResetPasswordActivity;)V

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/ResetPasswordActivity;->getNewPasswordAgain()Lcom/google/android/material/textfield/TextInputEditText;

    move-result-object v0

    new-instance v2, Lcom/android/mltcode/paycertificationapi/yk3;

    invoke-direct {v2, p0}, Lcom/android/mltcode/paycertificationapi/yk3;-><init>(Lcom/sma/smartv3/ui/me/ResetPasswordActivity;)V

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/ResetPasswordActivity;->getBtnConfirm()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/ResetPasswordActivity;->getNewPasswordAgain()Lcom/google/android/material/textfield/TextInputEditText;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/ui/me/ResetPasswordActivity$XIi00iiXO;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/ui/me/ResetPasswordActivity$XIi00iiXO;-><init>(Lcom/sma/smartv3/ui/me/ResetPasswordActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d104f

    return v0
.end method

.method public final nextStep(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/ResetPasswordActivity;->getEmail()Lcom/google/android/material/textfield/TextInputEditText;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-nez p1, :cond_0

    const p1, 0x7f140d1a

    invoke-static {p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    return-void

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/ResetPasswordActivity;->getVerificationCode()Lcom/google/android/material/textfield/TextInputEditText;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-nez p1, :cond_1

    const p1, 0x7f1404f4

    invoke-static {p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    return-void

    :cond_1
    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/ResetPasswordActivity;->getLlGetVerificationCode()Landroid/widget/LinearLayout;

    move-result-object p1

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/ResetPasswordActivity;->getLlSetNewPassword()Landroid/widget/LinearLayout;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method
