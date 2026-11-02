.class public final Lcom/sma/smartv3/dialog/UserNoLoginDialogFragment;
.super Lcom/sma/smartv3/dialog/base/BaseDialogFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/sma/smartv3/dialog/base/BaseDialogFragment<",
        "Lcom/sma/smartv3/databinding/DialogUserNoLoginBinding;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    sget-object v0, Lcom/sma/smartv3/dialog/UserNoLoginDialogFragment$1;->INSTANCE:Lcom/sma/smartv3/dialog/UserNoLoginDialogFragment$1;

    invoke-direct {p0, v0}, Lcom/sma/smartv3/dialog/base/BaseDialogFragment;-><init>(Lkotlin/jvm/functions/Function3;)V

    return-void
.end method

.method public static synthetic XIi00iiXO(Lcom/sma/smartv3/dialog/UserNoLoginDialogFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/dialog/UserNoLoginDialogFragment;->initListener$lambda$0(Lcom/sma/smartv3/dialog/UserNoLoginDialogFragment;Landroid/view/View;)V

    return-void
.end method

.method private static final configureDialog$lambda$0(Landroid/app/Dialog;)Lkotlin/Unit;
    .locals 3

    const-string v0, "$this$setDialogAttr"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, v1}, Lcom/android/mltcode/paycertificationapi/IXO1X1OIi;->XOO0ii0(Landroid/app/Dialog;FILjava/lang/Object;)Landroid/view/Window;

    invoke-static {p0}, Lcom/android/mltcode/paycertificationapi/IXO1X1OIi;->I0IIOi(Landroid/app/Dialog;)Lkotlin/Unit;

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic iO(Landroid/app/Dialog;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/dialog/UserNoLoginDialogFragment;->configureDialog$lambda$0(Landroid/app/Dialog;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private static final initListener$lambda$0(Lcom/sma/smartv3/dialog/UserNoLoginDialogFragment;Landroid/view/View;)V
    .locals 2

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    const-string v1, "requireActivity(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i72;->Oi1I(Landroid/content/Context;)V

    invoke-virtual {p0}, Landroidx/fragment/app/DialogFragment;->dismiss()V

    return-void
.end method


# virtual methods
.method public configureDialog()V
    .locals 1

    invoke-super {p0}, Lcom/sma/smartv3/dialog/base/BaseDialogFragment;->configureDialog()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/zb6;

    invoke-direct {v0}, Lcom/android/mltcode/paycertificationapi/zb6;-><init>()V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/dialog/base/BaseDialogFragment;->setDialogAttr(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public initListener()V
    .locals 2

    invoke-super {p0}, Lcom/sma/smartv3/dialog/base/BaseDialogFragment;->initListener()V

    invoke-virtual {p0}, Lcom/sma/smartv3/dialog/base/BaseDialogFragment;->getBinding()Landroidx/viewbinding/ViewBinding;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/databinding/DialogUserNoLoginBinding;

    iget-object v0, v0, Lcom/sma/smartv3/databinding/DialogUserNoLoginBinding;->confirmBt:Landroid/widget/Button;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/yb6;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/yb6;-><init>(Lcom/sma/smartv3/dialog/UserNoLoginDialogFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method
