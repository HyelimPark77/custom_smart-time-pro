.class synthetic Lcom/sma/smartv3/db/dao/ChatVoiceMsgDao_Impl$2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/db/dao/ChatVoiceMsgDao_Impl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1009
    name = null
.end annotation


# static fields
.field static final synthetic $SwitchMap$com$sma$smartv3$dto$FunctionType:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    invoke-static {}, Lcom/sma/smartv3/dto/FunctionType;->values()[Lcom/sma/smartv3/dto/FunctionType;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/sma/smartv3/db/dao/ChatVoiceMsgDao_Impl$2;->$SwitchMap$com$sma$smartv3$dto$FunctionType:[I

    :try_start_0
    sget-object v1, Lcom/sma/smartv3/dto/FunctionType;->THIRD_PARTY_AI_ASSISTANT:Lcom/sma/smartv3/dto/FunctionType;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method
