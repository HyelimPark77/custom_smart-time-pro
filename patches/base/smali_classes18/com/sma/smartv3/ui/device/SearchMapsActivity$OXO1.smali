.class public final Lcom/sma/smartv3/ui/device/SearchMapsActivity$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/SearchMapsActivity;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 SearchMapsActivity.kt\ncom/sma/smartv3/ui/device/SearchMapsActivity\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,82:1\n82#2,12:83\n59#3:95\n62#4:96\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 SearchMapsActivity.kt\ncom/sma/smartv3/ui/device/SearchMapsActivity\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,82:1\n82#2,12:83\n59#3:95\n62#4:96\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic IO:Lcom/sma/smartv3/ui/device/SearchMapsActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/SearchMapsActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/SearchMapsActivity$OXO1;->IO:Lcom/sma/smartv3/ui/device/SearchMapsActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 8

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/SearchMapsActivity$OXO1;->IO:Lcom/sma/smartv3/ui/device/SearchMapsActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/SearchMapsActivity;->access$getSearchJob$p(Lcom/sma/smartv3/ui/device/SearchMapsActivity;)Lkotlinx/coroutines/XiOIO;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, Lkotlinx/coroutines/XiOIO$OXO1;->XIi00iiXO(Lkotlinx/coroutines/XiOIO;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/SearchMapsActivity$OXO1;->IO:Lcom/sma/smartv3/ui/device/SearchMapsActivity;

    invoke-static {v0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    move-result-object v2

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/IXOX0Xiii;->iO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v3

    new-instance v5, Lcom/sma/smartv3/ui/device/SearchMapsActivity$initView$1$1;

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/SearchMapsActivity$OXO1;->IO:Lcom/sma/smartv3/ui/device/SearchMapsActivity;

    invoke-direct {v5, v4, p1, v1}, Lcom/sma/smartv3/ui/device/SearchMapsActivity$initView$1$1;-><init>(Lcom/sma/smartv3/ui/device/SearchMapsActivity;Landroid/text/Editable;Lkotlin/coroutines/Continuation;)V

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/sma/smartv3/ui/device/SearchMapsActivity;->access$setSearchJob$p(Lcom/sma/smartv3/ui/device/SearchMapsActivity;Lkotlinx/coroutines/XiOIO;)V

    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method
