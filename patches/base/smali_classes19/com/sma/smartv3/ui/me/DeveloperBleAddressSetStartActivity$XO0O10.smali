.class public final Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity$XO0O10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/i1OIOOIiX;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDeveloperBleAddressSetStartActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperBleAddressSetStartActivity.kt\ncom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity$mScanner$2$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,405:1\n1011#2,2:406\n*S KotlinDebug\n*F\n+ 1 DeveloperBleAddressSetStartActivity.kt\ncom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity$mScanner$2$2\n*L\n130#1:406,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDeveloperBleAddressSetStartActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperBleAddressSetStartActivity.kt\ncom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity$mScanner$2$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,405:1\n1011#2,2:406\n*S KotlinDebug\n*F\n+ 1 DeveloperBleAddressSetStartActivity.kt\ncom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity$mScanner$2$2\n*L\n130#1:406,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final O00(Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity;)V
    .locals 2

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity;->access$getEtOldBleName(Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity;)Landroid/widget/EditText;

    move-result-object v0

    const-string v1, "access$getEtOldBleName(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity;->startSearch(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic XO0O10(Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity$XO0O10;->O00(Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity;)V

    return-void
.end method


# virtual methods
.method public OXO1(Z)V
    .locals 4

    const/16 v0, 0x8

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity;->access$getBtStartSet(Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity;)Landroidx/appcompat/widget/AppCompatButton;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity;->access$isAutoSet$p(Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity;->access$getBtStartSet(Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity;)Landroidx/appcompat/widget/AppCompatButton;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity;->access$getMList(Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/IOXI0;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/IOXI0;-><init>(Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity;)V

    const-wide/16 v2, 0x7d0

    invoke-virtual {p1, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :cond_1
    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity;->access$getEtOldBleName(Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity;)Landroid/widget/EditText;

    move-result-object v0

    const-string v1, "access$getEtOldBleName(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity;->startSet(Landroid/view/View;)V

    return-void

    :cond_2
    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity;->access$getBtStartSet(Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity;)Landroidx/appcompat/widget/AppCompatButton;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public XIi00iiXO(Lcom/bestmafen/baseble/scanner/BleDevice;)V
    .locals 3

    const-string v0, "device"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity;->access$getMList(Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity;->access$getMList(Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity;->access$getMList(Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_1

    new-instance v0, Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity$XO0O10$OXO1;

    invoke-direct {v0}, Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity$XO0O10$OXO1;-><init>()V

    invoke-static {p1, v0}, Lcom/android/mltcode/paycertificationapi/XiX0OOXI0;->XOXiX0(Ljava/util/List;Ljava/util/Comparator;)V

    :cond_1
    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity;->access$getTvSearchNumber(Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity;)Landroid/widget/TextView;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity;->access$getMList(Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const v2, 0x7f1403fb

    invoke-virtual {v0, v2, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity;->access$getMListAdapter(Lcom/sma/smartv3/ui/me/DeveloperBleAddressSetStartActivity;)Lcom/android/mltcode/paycertificationapi/XII0Oi10O;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    return-void
.end method

.method public iO()V
    .locals 0

    return-void
.end method
