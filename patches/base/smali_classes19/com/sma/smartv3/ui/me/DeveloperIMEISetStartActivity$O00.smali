.class public final Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity$O00;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/i1OIOOIiX;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDeveloperIMEIStartActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperIMEIStartActivity.kt\ncom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity$mScanner$2$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,510:1\n1#2:511\n19#3:512\n15#3:513\n1011#4,2:514\n*S KotlinDebug\n*F\n+ 1 DeveloperIMEIStartActivity.kt\ncom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity$mScanner$2$2\n*L\n135#1:512\n135#1:513\n141#1:514,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDeveloperIMEIStartActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperIMEIStartActivity.kt\ncom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity$mScanner$2$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,510:1\n1#2:511\n19#3:512\n15#3:513\n1011#4,2:514\n*S KotlinDebug\n*F\n+ 1 DeveloperIMEIStartActivity.kt\ncom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity$mScanner$2$2\n*L\n135#1:512\n135#1:513\n141#1:514,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity$O00;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final O00(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)V
    .locals 2

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->access$getEtOldBleName(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)Landroid/widget/EditText;

    move-result-object v0

    const-string v1, "access$getEtOldBleName(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->startSearch(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic XO0O10(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity$O00;->O00(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)V

    return-void
.end method


# virtual methods
.method public OXO1(Z)V
    .locals 4

    const/16 v0, 0x8

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity$O00;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->access$getBtStartSet(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)Landroidx/appcompat/widget/AppCompatButton;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity$O00;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->access$isAutoSet$p(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity$O00;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->access$getBtStartSet(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)Landroidx/appcompat/widget/AppCompatButton;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity$O00;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->access$getMList(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity$O00;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->access$getTAG$p(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " The search is empty, try again later"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity$O00;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/X1X10X1i;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/X1X10X1i;-><init>(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)V

    const-wide/16 v2, 0x7d0

    invoke-virtual {p1, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :cond_1
    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity$O00;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->access$getEtOldBleName(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)Landroid/widget/EditText;

    move-result-object v0

    const-string v1, "access$getEtOldBleName(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->startSet(Landroid/view/View;)V

    return-void

    :cond_2
    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity$O00;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->access$getBtStartSet(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)Landroidx/appcompat/widget/AppCompatButton;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public XIi00iiXO(Lcom/bestmafen/baseble/scanner/BleDevice;)V
    .locals 7

    const-string v0, "device"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity$O00;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->access$getMList(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity$O00;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->access$getFilterName$p(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {p1}, Lcom/bestmafen/baseble/scanner/BleDevice;->getMName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/q62;->iOO1ii1(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity$O00;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->access$getFilterName$p(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity$O00;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->access$getMConnectedFailMap$p(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {p1}, Lcom/bestmafen/baseble/scanner/BleDevice;->getMBluetoothDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_2

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    :cond_2
    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    const/16 v1, 0x8

    const-string v2, " "

    if-lt v0, v1, :cond_3

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity$O00;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->access$getTAG$p(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/bestmafen/baseble/scanner/BleDevice;->getMBluetoothDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object p1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " When the connection times out, skip first"

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    return-void

    :cond_3
    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/iI00I1XI;

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v3}, Lcom/android/mltcode/paycertificationapi/iI00I1XI;-><init>(Ljava/util/ArrayList;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Lcom/google/gson/Gson;

    invoke-direct {v3}, Lcom/google/gson/Gson;-><init>()V

    const-class v5, Lcom/android/mltcode/paycertificationapi/iI00I1XI;

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0, v5}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_4

    goto :goto_1

    :cond_4
    move-object v1, v0

    :goto_1
    check-cast v1, Lcom/android/mltcode/paycertificationapi/iI00I1XI;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/iI00I1XI;->XO0O10()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {p1}, Lcom/bestmafen/baseble/scanner/BleDevice;->getMBluetoothDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity$O00;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->access$getTAG$p(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/bestmafen/baseble/scanner/BleDevice;->getMBluetoothDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object p1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " The operation was successful"

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    return-void

    :cond_5
    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity$O00;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->access$getMList(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity$O00;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->access$getMList(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-le v0, v4, :cond_6

    new-instance v0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity$O00$OXO1;

    invoke-direct {v0}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity$O00$OXO1;-><init>()V

    invoke-static {p1, v0}, Lcom/android/mltcode/paycertificationapi/XiX0OOXI0;->XOXiX0(Ljava/util/List;Ljava/util/Comparator;)V

    :cond_6
    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity$O00;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->access$getTvSearchNumber(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)Landroid/widget/TextView;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity$O00;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->access$getMList(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)Ljava/util/List;

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

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity$O00;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;->access$getMListAdapter(Lcom/sma/smartv3/ui/me/DeveloperIMEISetStartActivity;)Lcom/android/mltcode/paycertificationapi/XII0Oi10O;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    return-void
.end method

.method public iO()V
    .locals 0

    return-void
.end method
