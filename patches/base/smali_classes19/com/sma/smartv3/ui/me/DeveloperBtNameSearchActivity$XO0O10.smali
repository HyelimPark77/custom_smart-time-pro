.class public final Lcom/sma/smartv3/ui/me/DeveloperBtNameSearchActivity$XO0O10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/i1OIOOIiX;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/me/DeveloperBtNameSearchActivity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDeveloperBtNameSearchActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperBtNameSearchActivity.kt\ncom/sma/smartv3/ui/me/DeveloperBtNameSearchActivity$mScanner$2$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,402:1\n1011#2,2:403\n*S KotlinDebug\n*F\n+ 1 DeveloperBtNameSearchActivity.kt\ncom/sma/smartv3/ui/me/DeveloperBtNameSearchActivity$mScanner$2$2\n*L\n113#1:403,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDeveloperBtNameSearchActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperBtNameSearchActivity.kt\ncom/sma/smartv3/ui/me/DeveloperBtNameSearchActivity$mScanner$2$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,402:1\n1011#2,2:403\n*S KotlinDebug\n*F\n+ 1 DeveloperBtNameSearchActivity.kt\ncom/sma/smartv3/ui/me/DeveloperBtNameSearchActivity$mScanner$2$2\n*L\n113#1:403,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/me/DeveloperBtNameSearchActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/me/DeveloperBtNameSearchActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperBtNameSearchActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperBtNameSearchActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Z)V
    .locals 1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperBtNameSearchActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperBtNameSearchActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperBtNameSearchActivity;->access$getMList(Lcom/sma/smartv3/ui/me/DeveloperBtNameSearchActivity;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    const/16 v0, 0x7d0

    if-ge p1, v0, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperBtNameSearchActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperBtNameSearchActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/me/DeveloperBtNameSearchActivity;->gotoSearch()V

    :cond_0
    return-void
.end method

.method public XIi00iiXO(Lcom/bestmafen/baseble/scanner/BleDevice;)V
    .locals 3

    const-string v0, "device"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperBtNameSearchActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperBtNameSearchActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/me/DeveloperBtNameSearchActivity;->access$getMList(Lcom/sma/smartv3/ui/me/DeveloperBtNameSearchActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_2

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperBtNameSearchActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperBtNameSearchActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/me/DeveloperBtNameSearchActivity;->access$getEtOldBleName(Lcom/sma/smartv3/ui/me/DeveloperBtNameSearchActivity;)Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lcom/bestmafen/baseble/scanner/BleDevice;->getMName()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperBtNameSearchActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperBtNameSearchActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/me/DeveloperBtNameSearchActivity;->access$getEtOldBleName(Lcom/sma/smartv3/ui/me/DeveloperBtNameSearchActivity;)Landroid/widget/EditText;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkotlin/text/StringsKt__StringsKt;->iX1X1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto/16 :goto_2

    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperBtNameSearchActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperBtNameSearchActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/me/DeveloperBtNameSearchActivity;->access$getMList(Lcom/sma/smartv3/ui/me/DeveloperBtNameSearchActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/16 v1, 0x7d0

    if-ge v0, v1, :cond_3

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperBtNameSearchActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperBtNameSearchActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/me/DeveloperBtNameSearchActivity;->access$getMList(Lcom/sma/smartv3/ui/me/DeveloperBtNameSearchActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperBtNameSearchActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperBtNameSearchActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperBtNameSearchActivity;->access$getTvSearchNumber(Lcom/sma/smartv3/ui/me/DeveloperBtNameSearchActivity;)Landroid/widget/TextView;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperBtNameSearchActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperBtNameSearchActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/me/DeveloperBtNameSearchActivity;->access$getMList(Lcom/sma/smartv3/ui/me/DeveloperBtNameSearchActivity;)Ljava/util/List;

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

    :cond_3
    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperBtNameSearchActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperBtNameSearchActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperBtNameSearchActivity;->access$getEtOldBleName(Lcom/sma/smartv3/ui/me/DeveloperBtNameSearchActivity;)Landroid/widget/EditText;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-nez p1, :cond_4

    goto :goto_1

    :cond_4
    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperBtNameSearchActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperBtNameSearchActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperBtNameSearchActivity;->access$getMList(Lcom/sma/smartv3/ui/me/DeveloperBtNameSearchActivity;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    const/16 v0, 0x64

    if-ge p1, v0, :cond_6

    :goto_1
    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperBtNameSearchActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperBtNameSearchActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperBtNameSearchActivity;->access$getMList(Lcom/sma/smartv3/ui/me/DeveloperBtNameSearchActivity;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_5

    new-instance v0, Lcom/sma/smartv3/ui/me/DeveloperBtNameSearchActivity$XO0O10$OXO1;

    invoke-direct {v0}, Lcom/sma/smartv3/ui/me/DeveloperBtNameSearchActivity$XO0O10$OXO1;-><init>()V

    invoke-static {p1, v0}, Lcom/android/mltcode/paycertificationapi/XiX0OOXI0;->XOXiX0(Ljava/util/List;Ljava/util/Comparator;)V

    :cond_5
    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperBtNameSearchActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperBtNameSearchActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperBtNameSearchActivity;->access$getMListAdapter(Lcom/sma/smartv3/ui/me/DeveloperBtNameSearchActivity;)Lcom/android/mltcode/paycertificationapi/XII0Oi10O;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    :cond_6
    :goto_2
    return-void
.end method

.method public iO()V
    .locals 0

    return-void
.end method
