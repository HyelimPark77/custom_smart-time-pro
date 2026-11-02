.class public final Lcom/sma/smartv3/ui/ai/AIChatActivity$XIi00iiXO;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/sma/smartv3/ui/ai/BaseAIActivity$OXO1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/ai/AIChatActivity;->questionAssistant(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/sma/smartv3/ui/ai/BaseAIActivity$OXO1<",
        "Lcom/sma/smartv3/model/AIAnswer;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAIChatActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AIChatActivity.kt\ncom/sma/smartv3/ui/ai/AIChatActivity$questionAssistant$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,992:1\n11561#2:993\n11896#2,3:994\n*S KotlinDebug\n*F\n+ 1 AIChatActivity.kt\ncom/sma/smartv3/ui/ai/AIChatActivity$questionAssistant$1\n*L\n952#1:993\n952#1:994,3\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAIChatActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AIChatActivity.kt\ncom/sma/smartv3/ui/ai/AIChatActivity$questionAssistant$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,992:1\n11561#2:993\n11896#2,3:994\n*S KotlinDebug\n*F\n+ 1 AIChatActivity.kt\ncom/sma/smartv3/ui/ai/AIChatActivity$questionAssistant$1\n*L\n952#1:993\n952#1:994,3\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/ai/AIChatActivity;

.field public final synthetic XIi00iiXO:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/ai/AIChatActivity;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/ai/AIChatActivity;

    iput-object p2, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity$XIi00iiXO;->XIi00iiXO:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final O00(Lcom/sma/smartv3/db/entity/AIRecords;)Z
    .locals 2

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/db/entity/AIRecords;->getMType()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/db/entity/AIRecords;->getMType()I

    move-result p0

    const/4 v0, 0x2

    if-eq p0, v0, :cond_0

    return v1

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static synthetic iO(Lcom/sma/smartv3/db/entity/AIRecords;)Z
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/ai/AIChatActivity$XIi00iiXO;->O00(Lcom/sma/smartv3/db/entity/AIRecords;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public OXO1(Ljava/lang/String;)V
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic XIi00iiXO(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/sma/smartv3/model/AIAnswer;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/ai/AIChatActivity$XIi00iiXO;->XO0O10(Lcom/sma/smartv3/model/AIAnswer;)V

    return-void
.end method

.method public XO0O10(Lcom/sma/smartv3/model/AIAnswer;)V
    .locals 32

    move-object/from16 v0, p0

    const-string v1, "result"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Lcom/sma/smartv3/model/AIAnswer;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lez v1, :cond_3

    invoke-virtual {v2}, Lcom/sma/smartv3/model/AIAnswer;->getEnded()I

    move-result v1

    const/4 v3, 0x1

    if-ne v1, v3, :cond_3

    invoke-virtual {v2}, Lcom/sma/smartv3/model/AIAnswer;->getText()Ljava/lang/String;

    move-result-object v4

    const-string v1, "```json"

    const/4 v2, 0x0

    const/4 v5, 0x2

    const/4 v10, 0x0

    invoke-static {v4, v1, v2, v5, v10}, Lcom/android/mltcode/paycertificationapi/oe5;->O0(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    const-string v1, "["

    invoke-static {v4, v1, v2, v5, v10}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    const-string v1, "]"

    invoke-static {v4, v1, v2, v5, v10}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    const/4 v8, 0x6

    const/4 v9, 0x0

    const-string v5, "["

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lkotlin/text/StringsKt__StringsKt;->OO1101010(Ljava/lang/CharSequence;Ljava/lang/String;IZILjava/lang/Object;)I

    move-result v1

    const-string v5, "]"

    invoke-static/range {v4 .. v9}, Lkotlin/text/StringsKt__StringsKt;->OO1101010(Ljava/lang/CharSequence;Ljava/lang/String;IZILjava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    invoke-virtual {v4, v1, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    const-string v4, "substring(...)"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Lorg/json/JSONArray;

    invoke-direct {v4, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result v1

    new-array v5, v1, [Ljava/lang/String;

    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result v6

    move v7, v2

    :goto_0
    if-ge v7, v6, :cond_0

    invoke-virtual {v4, v7}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v8

    aput-object v8, v5, v7

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_0
    iget-object v4, v0, Lcom/sma/smartv3/ui/ai/AIChatActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/ai/AIChatActivity;

    invoke-virtual {v4}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->getMList()Ljava/util/List;

    move-result-object v4

    new-instance v6, Lcom/android/mltcode/paycertificationapi/XOXiX0;

    invoke-direct {v6}, Lcom/android/mltcode/paycertificationapi/XOXiX0;-><init>()V

    invoke-static {v4, v6}, Lcom/android/mltcode/paycertificationapi/OIXO1IIOO;->iIX0i(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Z

    iget-object v4, v0, Lcom/sma/smartv3/ui/ai/AIChatActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/ai/AIChatActivity;

    invoke-virtual {v4}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->getMList()Ljava/util/List;

    move-result-object v4

    new-instance v11, Lcom/sma/smartv3/db/entity/AIRecords;

    iget-object v6, v0, Lcom/sma/smartv3/ui/ai/AIChatActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/ai/AIChatActivity;

    invoke-virtual {v6}, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->getMAIFunction()Lcom/sma/smartv3/model/AIFunction;

    move-result-object v6

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v6}, Lcom/sma/smartv3/model/AIFunction;->getType()Lcom/sma/smartv3/model/AIFunctionType;

    move-result-object v6

    invoke-virtual {v6}, Lcom/sma/smartv3/model/AIFunctionType;->getType()I

    move-result v16

    iget-object v6, v0, Lcom/sma/smartv3/ui/ai/AIChatActivity$XIi00iiXO;->XIi00iiXO:Ljava/lang/String;

    const v30, 0x1ff47

    const/16 v31, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x6

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

    move-object/from16 v18, v6

    invoke-direct/range {v11 .. v31}, Lcom/sma/smartv3/db/entity/AIRecords;-><init>(IJLjava/lang/String;IILjava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v4, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v4, v0, Lcom/sma/smartv3/ui/ai/AIChatActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/ai/AIChatActivity;

    invoke-static {v4, v10, v3, v10}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->addMoveQuestions$default(Lcom/sma/smartv3/ui/ai/AIChatActivity;Ljava/lang/String;ILjava/lang/Object;)V

    iget-object v3, v0, Lcom/sma/smartv3/ui/ai/AIChatActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/ai/AIChatActivity;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4, v1}, Ljava/util/ArrayList;-><init>(I)V

    :goto_1
    if-ge v2, v1, :cond_1

    aget-object v6, v5, v2

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v3, v6}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->addMoveQuestions(Ljava/lang/String;)V

    sget-object v6, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-interface {v4, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    iget-object v1, v0, Lcom/sma/smartv3/ui/ai/AIChatActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/ai/AIChatActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->access$getMAdapter$p(Lcom/sma/smartv3/ui/ai/AIChatActivity;)Lcom/bestmafen/androidbase/adapter/recyclerview/MultiItemTypeAdapter;

    move-result-object v1

    if-nez v1, :cond_2

    const-string v1, "mAdapter"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_2

    :cond_2
    move-object v10, v1

    :goto_2
    invoke-virtual {v10}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    :cond_3
    return-void
.end method
