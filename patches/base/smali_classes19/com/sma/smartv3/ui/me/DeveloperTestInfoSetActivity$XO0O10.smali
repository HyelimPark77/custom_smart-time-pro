.class public final Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity$XO0O10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/i1OIOOIiX;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDeveloperTestInfoSetActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperTestInfoSetActivity.kt\ncom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity$mScanner$2$2\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,392:1\n19#2:393\n15#2:394\n1011#3,2:395\n*S KotlinDebug\n*F\n+ 1 DeveloperTestInfoSetActivity.kt\ncom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity$mScanner$2$2\n*L\n105#1:393\n105#1:394\n111#1:395,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDeveloperTestInfoSetActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperTestInfoSetActivity.kt\ncom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity$mScanner$2$2\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,392:1\n19#2:393\n15#2:394\n1011#3,2:395\n*S KotlinDebug\n*F\n+ 1 DeveloperTestInfoSetActivity.kt\ncom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity$mScanner$2$2\n*L\n105#1:393\n105#1:394\n111#1:395,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Z)V
    .locals 2

    const/16 v0, 0x8

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->access$getBtStartSet(Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;)Landroidx/appcompat/widget/AppCompatButton;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->access$isAutoSet$p(Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->access$getBtStartSet(Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;)Landroidx/appcompat/widget/AppCompatButton;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->access$getMList(Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->access$autoStart(Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;)V

    return-void

    :cond_1
    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->access$getEtOldBleName(Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;)Landroid/widget/EditText;

    move-result-object v0

    const-string v1, "access$getEtOldBleName(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->startSet(Landroid/view/View;)V

    return-void

    :cond_2
    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->access$getBtStartSet(Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;)Landroidx/appcompat/widget/AppCompatButton;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public XIi00iiXO(Lcom/bestmafen/baseble/scanner/BleDevice;)V
    .locals 6

    const-string v0, "device"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->access$getMList(Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/OI11110i;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3, v2}, Lcom/android/mltcode/paycertificationapi/OI11110i;-><init>(Ljava/util/ArrayList;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lcom/google/gson/Gson;

    invoke-direct {v2}, Lcom/google/gson/Gson;-><init>()V

    const-class v4, Lcom/android/mltcode/paycertificationapi/OI11110i;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0, v4}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    move-object v1, v0

    :goto_0
    check-cast v1, Lcom/android/mltcode/paycertificationapi/OI11110i;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/OI11110i;->XO0O10()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {p1}, Lcom/bestmafen/baseble/scanner/BleDevice;->getMBluetoothDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    :goto_1
    return-void

    :cond_2
    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->access$getMList(Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->access$getMList(Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-le v0, v3, :cond_3

    new-instance v0, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity$XO0O10$OXO1;

    invoke-direct {v0}, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity$XO0O10$OXO1;-><init>()V

    invoke-static {p1, v0}, Lcom/android/mltcode/paycertificationapi/XiX0OOXI0;->XOXiX0(Ljava/util/List;Ljava/util/Comparator;)V

    :cond_3
    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->access$getTvSearchNumber(Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;)Landroid/widget/TextView;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->access$getMList(Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;)Ljava/util/List;

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

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;->access$getMListAdapter(Lcom/sma/smartv3/ui/me/DeveloperTestInfoSetActivity;)Lcom/android/mltcode/paycertificationapi/XII0Oi10O;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    return-void
.end method

.method public iO()V
    .locals 0

    return-void
.end method
