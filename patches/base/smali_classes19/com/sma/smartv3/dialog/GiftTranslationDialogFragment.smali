.class public final Lcom/sma/smartv3/dialog/GiftTranslationDialogFragment;
.super Lcom/sma/smartv3/dialog/base/BaseDialogFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/sma/smartv3/dialog/base/BaseDialogFragment<",
        "Lcom/sma/smartv3/databinding/DialogGiftTranslationTimeBinding;",
        ">;"
    }
.end annotation


# instance fields
.field private freeTime:I


# direct methods
.method public constructor <init>()V
    .locals 1

    sget-object v0, Lcom/sma/smartv3/dialog/GiftTranslationDialogFragment$1;->INSTANCE:Lcom/sma/smartv3/dialog/GiftTranslationDialogFragment$1;

    invoke-direct {p0, v0}, Lcom/sma/smartv3/dialog/base/BaseDialogFragment;-><init>(Lkotlin/jvm/functions/Function3;)V

    return-void
.end method

.method public static synthetic XIi00iiXO(Lcom/sma/smartv3/dialog/GiftTranslationDialogFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/dialog/GiftTranslationDialogFragment;->initListener$lambda$0(Lcom/sma/smartv3/dialog/GiftTranslationDialogFragment;Landroid/view/View;)V

    return-void
.end method

.method private static final configureDialog$lambda$0(Landroid/app/Dialog;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$setDialogAttr"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lcom/android/mltcode/paycertificationapi/IXO1X1OIi;->I0IIOi(Landroid/app/Dialog;)Lkotlin/Unit;

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroid/app/Dialog;->setCancelable(Z)V

    invoke-static {p0}, Lcom/android/mltcode/paycertificationapi/IXO1X1OIi;->OIi0(Landroid/app/Dialog;)Lkotlin/Unit;

    invoke-static {p0}, Lcom/android/mltcode/paycertificationapi/IXO1X1OIi;->OXO1(Landroid/app/Dialog;)Lkotlin/Unit;

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic iO(Landroid/app/Dialog;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/dialog/GiftTranslationDialogFragment;->configureDialog$lambda$0(Landroid/app/Dialog;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private static final initListener$lambda$0(Lcom/sma/smartv3/dialog/GiftTranslationDialogFragment;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Landroidx/fragment/app/DialogFragment;->dismiss()V

    return-void
.end method


# virtual methods
.method public configureDialog()V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/O1OOOX;

    invoke-direct {v0}, Lcom/android/mltcode/paycertificationapi/O1OOOX;-><init>()V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/dialog/base/BaseDialogFragment;->setDialogAttr(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public initData()V
    .locals 2

    invoke-super {p0}, Lcom/sma/smartv3/dialog/base/BaseDialogFragment;->initData()V

    invoke-virtual {p0}, Lcom/sma/smartv3/dialog/base/BaseDialogFragment;->getBinding()Landroidx/viewbinding/ViewBinding;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/databinding/DialogGiftTranslationTimeBinding;

    iget-object v0, v0, Lcom/sma/smartv3/databinding/DialogGiftTranslationTimeBinding;->freeTimeValueTv:Landroid/widget/TextView;

    iget v1, p0, Lcom/sma/smartv3/dialog/GiftTranslationDialogFragment;->freeTime:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public initListener()V
    .locals 2

    invoke-virtual {p0}, Lcom/sma/smartv3/dialog/base/BaseDialogFragment;->getBinding()Landroidx/viewbinding/ViewBinding;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/databinding/DialogGiftTranslationTimeBinding;

    iget-object v0, v0, Lcom/sma/smartv3/databinding/DialogGiftTranslationTimeBinding;->giftTranslationConfirmRl:Landroid/widget/RelativeLayout;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/OO1i0I;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/OO1i0I;-><init>(Lcom/sma/smartv3/dialog/GiftTranslationDialogFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public final setFreeTime(F)V
    .locals 0

    float-to-int p1, p1

    iput p1, p0, Lcom/sma/smartv3/dialog/GiftTranslationDialogFragment;->freeTime:I

    return-void
.end method
